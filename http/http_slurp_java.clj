; Using slurp and the Java URL class

; content get
(defn http-get [url] (slurp (.openStream (java.net.URL. url))))
(defn http-get-simple [url] (slurp url))

; header get
(defn http-headers
  [url]
  (.getHeaderFields (.openConnection (java.net.URL. url))))

(println "----- HTTP Content ------")
(println (http-get "https://www.google.com"))

(println "\n----- HTTP Content Simple ------")
(println (http-get-simple "https://www.google.com"))

(println "\n----- HTTP Headers ------")
(println (http-headers "https://www.google.com"))
