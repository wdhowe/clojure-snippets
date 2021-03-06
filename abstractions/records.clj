; records - custom map like data types.
;           fields or slots are specified so each entry
;           will have the same keys.

; define the record and its fields:
(defrecord VendItem [name brand description])

; create some records - show two ways to create (map-> and ->)
(def my-tp (map->VendItem {:name "tp" :brand "Wipem" :description "Nothing wipes like Wipem!"}))
(def my-meat (->VendItem "meat" "Its Real" "Tastes like the real thing!"))

; when creating with "map->", not all fields are required.
(def my-bleach (map->VendItem {:name "bleach" :brand "Not My Eyes"}))

(println "Some records. Notice all keys are present, defined or not. (when using map->)")
(println "My tp is:" my-tp)
(println "My meat is:" my-meat)
(println "My bleach is:" my-bleach)
