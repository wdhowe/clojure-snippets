#!/usr/bin/env boot

; boot environment settings
(set-env! :dependencies '[[clj-http "3.10.0"]])

; boot clojar requirement
(require '[clj-http.client :as http])
(require '[boot.cli :as cli])

(defn get_url
  "Execute a http get on a url. Returns: the response symbol."
  [url]
  (http/get url)
)

(cli/defclifn -main
  "HTTP Headers and Response with clj-http. Uses boot cli args for URL."
  ; short-option long-option parameter(optional) type description
  [u url URL str "address to http/get on."]
  ; Note: -h (help) is built into the boot cli arg parser

  (when (nil? url)
    (println "-> URL (-u) was not provided.")
    (System/exit 1)
  )

  (println "-> HTTP/GET on:" url)
  (def response (get_url url) )

  (println "\n-> Available keys are:" (keys response)
           "\n\n-> Response status code:" (:status response)
           "\n\n-> Headers are:" (:headers response))
)
