; sets - unordered, no duplicates

(def jedi #{"yoda", "obi-wan", "luke"} )

(println "Some Jedi are:" jedi)
(println "Adding another:" (conj jedi "quigon"))
(println "Some...died." (disj jedi "obi-wan" "yoda"))

(println "\nIs Luke a Jedi?" (contains? jedi "luke"))
(println "Sorted" (conj (sorted-set) "yoda" "obi-wan" "luke") )

(def sith #{"vader", "palpatine"})

(println "\nUsers of the force:" (into jedi sith))

