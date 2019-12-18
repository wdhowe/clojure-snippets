; different methods of building maps

; zipmap - combine two sequences together
(def names '("Joe", "John", "Bob"))
(def foods '("pizza", "burgers", "corn dogs"))
(def favorite_foods (zipmap names foods))

(println "Fav food map:" favorite_foods)
(println "Starting HP:" (zipmap names (repeat 100)))

; using map and into
(println "\nMap/into method:" (into {} (map (fn [a_name] [a_name 500]) names)) )

; combining maps - right most wins in a conflict
(def more_foods { "Bill" "rice", "The Dude" "fries", "Bob" "ice cream"})
(println "\nCombined foods:" (merge favorite_foods more_foods))

(println "\nCombined foods, merge-with 'str'(concat) on conflict:" (merge-with str favorite_foods more_foods))

; sorted maps
(def favorite_foods_sorted (sorted-map "Joe" "pizza",
                                       "John" "burgers",
                                       "Bob" "corn dogs"))
(println "\nSorted favorite foods:" favorite_foods_sorted)

