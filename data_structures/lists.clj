; sequential linked lists
; new elements added to the front/head

(def list1 '(1 2 3))
(println "The first list is:" list1)
(println "The first item is:" (first list1))
(println "The rest of them are:" (rest list1))
(println "The first item via peek is:" (peek list1))
(println "Last items are:" (pop list1))
(println "Some items added:" (conj list1 40 50))
