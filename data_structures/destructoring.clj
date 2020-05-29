;; destructoring - pull out parts from a collection and bind to symbols

; destructure a map's keys and
; retain access to the original structure with ":as"
(defn my-location
  "Show my location."
  [{:keys [long lat], :as orig-data}]
  (println "My location is: long(" long "), lat(" lat ")")
  (println "The original data is: " orig-data))

(my-location {:long 50.2, :lat 60.5, :activity "chillin"})
