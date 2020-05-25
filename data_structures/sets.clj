;; sets - unique values/no duplicates

; Creating sets - literal and keyword
(def jedi #{"yoda" "obi-wan" "luke"})
(def sith (hash-set "vader" "palpatine"))

; The sets
(println "Some Jedi are:" jedi)
(println "Some Sith are:" sith)

; Getting items
(println "\nFirst item in jedi set:" (first jedi))
(println "Last item in jedi set:" (last jedi))
(println "Specific item in jedi set (yoda):" (get jedi "yoda"))

; Adding/removing
(println "\nAdding another (conj):" (conj jedi "quigon"))
(println "Some...died. (disj on original set)" (disj jedi "obi-wan" "yoda"))

; Checking the set
(println "\nIs Luke a Jedi? (contains?)" (contains? jedi "luke"))
(println "Is Luke a Sith? (contains?)" (contains? sith "luke"))

; Create sets from a vector
(def friends ["joe" "john" "joe" "joe"])
(println "\nSet from a vector (removes dups):" (set friends))
