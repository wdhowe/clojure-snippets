;; lists - sequential linked lists
;; Use when: You need to store a sequence of values AND
;;           you need to add to the beginning OR
;;           you are writing a macro. (otherwise, use a vector)

; Creating lists - literal and keyword
(def list1 '(1 2 3))
(def list2 (list 4 5 6))

; The lists
(println "List1 is:" list1)
(println "List2 is:" list2)

; Getting items
(println "\nThe first item is:" (first list1))
(println "The last item is:" (last list1))
(println "The nth item at position 1 is:" (nth list1 1))

; Adding/removing
(println "\nAdd items to the beginning of list1 with conj:" (conj list1 40 50))
(println "Remove the first item in list1 (pop):" (pop list1))

; Checking the list
(println "\nIs 5 in list1?:" (some (partial = 5) list1))
(println "Is 5 in list2?:" (some (partial = 5) list2))
