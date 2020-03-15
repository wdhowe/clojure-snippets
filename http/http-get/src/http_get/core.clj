(ns http-get.core
  (:require [clojure.tools.cli]
            [clj-http.client :as http])
  (:gen-class))

(def cli_options
  "CLI arguments (clojure.tools.cli)"
  [;[short-option long-option description :other options]
   ["-h" "--help" "Show help" :default false]
   ["-u" "--url URL" "Address to http/get on" :default
    "https://www.google.com"]])

(defn show_usage
  "Show the application usage"
  [cli_args]
  (println "\n--App Usage--\n" (:summary cli_args)))

(defn get_url
  "Execute a http get on a url. Returns: a response map."
  [url]
  (http/get url))

(defn -main
  "HTTP Headers and Response with clj-http. Uses boot cli args for URL."
  [& args]
  ; parse command line args
  (def cli_args (clojure.tools.cli/parse-opts args cli_options))
  ;(println "All args:\n" cli_args)
  ; show usage when help flag set and exit
  (when (get-in cli_args [:options :help])
    (show_usage cli_args)
    (System/exit 0))
  ; extract the url from the cli args
  (def url (get-in cli_args [:options :url]))
  (println "-> HTTP/GET on:" url)
  ; execute the http/get on the url
  (def response (get_url url))
  (println "\n-> Available keys are:" (keys response)
           "\n\n-> Response status code:" (:status response)
           "\n\n-> Headers are:" (:headers response)))