; sequential linked lists
; new elements added to the front/head

(def list1 '(1 2 3))

(println "The list is:" list1)
(println "The first item is:" (first list1))
(println "The last item is:" (last list1))
(println "The nth item at position 1 is:" (nth list1 1))
(println "Add items to the beginning of the list with conj:" (conj list1 40 50))
