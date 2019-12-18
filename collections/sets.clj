; sets - unordered, no duplicates

(def jedi #{"yoda", "obi-wan", "luke"} )

(println "Some Jedi are:" jedi)
(println "Adding another:" (conj jedi "quigon"))
(println "Some...died." (disj jedi "obi-wan" "yoda"))

(println "\nIs Luke a Jedi?" (contains? jedi "luke"))
(println "Sorted" (conj (sorted-set) "yoda" "obi-wan" "luke") )

; sets can be joined with 'into'
(def sith #{"vader", "palpatine"})

(println "\nUsers of the force (two sets):" (into jedi sith))

; into can also join other collections (vectors, sets, lists, maps)
(def friends (vector "joe" "john") )

(println "\nUsers of the force and some friends (set and vector):" (into jedi friends))

