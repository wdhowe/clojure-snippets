; vectors - indexed, sequential (like an array)
; new elements added to the end/tail

(def v1 [1 2 3])
(println "The vector:" v1)
(println "The element at index 0 is:" (get v1 0))
(println "There are" (count v1) "elements in this vector.")

(def v2 (vector 4 5 6))
(println "Another vector is:" v2)
(println "v1 conjoined with some numbers is:" (conj v1 10 11 12))
