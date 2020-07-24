;; destructoring - pull out parts from a collection and bind to symbols

; destructure a map's keys and
; retain access to the original structure with ":as"
(defn my-location
  "Show my location."
  [{:keys [long lat]
    :or {long "here" lat "there"}  ; set default values if keys are missing from args
    :as orig-data}]
  (println "My location is: long(" long "), lat(" lat ")")
  (println "The original data is:" orig-data))

(my-location {:long 50.2, :lat 60.5, :activity "chillin"})
(println "\nCall again, but with a missing key to trigger defaults.")
(my-location {:long 100.0 :activity "chillin again"})

; another way to destructure a map - explicit binding symbols to keys.
(defn my-location2
  "Show my location...again."
  [{long :long lat :lat}]
  (println "\nMy location 2 is: long(" long "), lat(" lat ")"))

(my-location2 {:long 50.2, :lat 60.5, :activity "chillin"})

; destructure a vector
(defn my-stuff
  "Some of my things."
  [[first-thing second-thing & others]]
  (println "\nThe best thing is:" first-thing)
  (println "The next best thing is:" second-thing)
  (println "Annd...the rest:" others))

(my-stuff ["laptop" "pizza" "socks" "phone" "movies"])
