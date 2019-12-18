; maps are used for key/value lookups or representing domain application data
; key/value lookups = hash lookups/dictionaries in other languages

(def lightsabers { "yoda" "green",
                  "luke" "blue",
                  "vader" "red" } )

; displaying from the map
(println "All lightsabers:" lightsabers)
(println "Lightsaber for yoda:" (get lightsabers "yoda") )
(println "Lightsaber for vader" (get lightsabers "vader") )

; adding and removing from the map
(println "\nAdding mace windu:" (assoc lightsabers "mace" "purple") )
(println "Removing luke:" (dissoc lightsabers "luke") )

; checking map contents
(println "\nDoes the map contain luke?" (contains? lightsabers "luke"))
(println "Find vader:" (find lightsabers "vader"))
(println "Bad lookup, use a default if not found:" (get lightsabers "nobody" "none found"))

; just keys or values
(println "\nDisplay keys only:" (keys lightsabers))
(println "Display values only:" (vals lightsabers))

