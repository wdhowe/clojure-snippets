#!/usr/bin/env boot

; boot environment settings
(set-env! :dependencies '[[clj-http "3.10.0"]])

; boot clojar requirement
(require '[clj-http.client :as http])

(defn get_url
  "Execute a http get on a url. Returns: the response symbol."
  [url]
  (http/get url)
)

(defn -main
  "HTTP Headers and Response with clj-http. Uses first positional arg for URL."
  [& args]

  (println "HTTP/GET on:" (first args))
  (def response (get_url (first args)) )

  (println "\n-> Available keys are:" (keys response))
  (println "\n-> Response status code:" (:status response))
  (println "\n-> Headers are:" (:headers response))
)
