; filter and remove to reduce items in a new copy of a collection

(def mylist (vector 1 2 3 4 5 6 7 8 9 10))

; filter - return only what returns true
(println "Filter odd")
(println (filter odd? mylist) )

; reduce - remove items that return true
(println "\nRemove odd")
(println (remove odd? mylist) )
