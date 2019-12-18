; records are an alternative to nested maps
; they usually have better performance and were designed
; for this use case

; 1) define a record structure
(defrecord Jedi [name lightsaber job])

; 2) create the record, either via positional or mapped method

; positional contructor method
(def yoda (->Jedi "Yoda" "green" "head of council"))

(println "Created record (positional):" yoda)
(println "Lightsaber color is:" (:lightsaber yoda))

; map constructor method
(def mace (map->Jedi
            {:name "Mace Windu"
            :lightsaber "purple"
            :job "member of council"} ))

(println "\nCreated record (mapped):" mace)
(println "Lightsaber color is:" (:lightsaber mace))

