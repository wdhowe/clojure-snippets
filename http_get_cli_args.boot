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
  [u url URL str "address to http/get on."]

  (if (nil? url)
    (throw (IllegalArgumentException. "URL (-u) was not provided."))
  )

  (println "-> HTTP/GET on:" url)
  (def response (get_url url) )

  (println "\n-> Available keys are:" (keys response)
           "\n\n-> Response status code:" (:status response)
           "\n\n-> Headers are:" (:headers response))
)
