;; maps - key/value lookups (dictionaries or hashes)
;; Use when: You have natural key/value lookup requirements or
;;           as a useful top level structure for nested data.

; Creating maps - literal and keyword
(def jedi1
  {:name "Yoda", :lightsaber "green", :height "very small", :job "Jedi Sage", :foods {:favorite "pizza" :dislikes "spinach"}})
(def jedi2
  (hash-map :name "Luke" :lightsaber "blue" :height "normal" :job "Jedi Master" :foods {:favorite "burgers" :dislikes "fish"}))

; The maps
(println "Jedi 1:" jedi1)
(println "Jedi 2:" jedi2)

; Getting items - get and keyword
(println "\nLightsaber for yoda:" (get jedi1 :lightsaber))
(println "Lightsaber for luke:" (:lightsaber jedi2))
(println "Nested get for yoda (fav food):" (get-in jedi1 [:foods :favorite]))

; Adding/removing
(println "\nAdding jedi1's home:" (assoc jedi1 :home "a swamp"))
(println "Removing jedi2's job:" (dissoc jedi2 :job))

; Checking the map
(println "\nDoes the jedi1 map contain a lightsaber?" (contains? jedi1 :lightsaber))
(println "Find a job in the jedi2 map:" (find jedi2 :job))
(println "Bad lookup in the jedi1 map, use a default if not found:"
         (get jedi1 :nothing "stop it now"))

; Display just keys or values
(println "\nDisplay jedi1 map keys only:" (keys jedi1))
(println "Display jedi1 map values only:" (vals jedi1))
