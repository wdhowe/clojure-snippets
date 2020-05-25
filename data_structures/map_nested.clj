; nested maps

(def person
  {:name "The Dude",
   :address {:street "123 Chill Ave", :city "Malibu", :state "California"}})

(println "The nested map:" person)
(println "City:" (get-in person [:address :city]))

; modifying nested maps
(println "\nModifying the nested map:"
         (assoc-in person [:address :city] "San Diego"))
