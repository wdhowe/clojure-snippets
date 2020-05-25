;; vectors - indexed, sequential (like an array)
;; Use when: You need to store a sequence of values AND
;;           you do NOT need to add to the beginning AND
;;           you are NOT writing a macro. (otherwise, use a list)

; Creating vectors - literal and keyword
(def v1 [1 2 3])
(def v2 (vector 4 5 6))

; The vectors
(println "Vector1:" v1)
(println "Vector2:" v2)

; Getting items
(println "\nThe element at v1's index 0 is:" (get v1 0))
(println "There are" (count v1) "elements in this v1.")

; Adding/removing
(println "\nAdd items to the end of the vector:" (conj v1 10 11 12))
(println "Remove the last item in the vector:" (pop v1))

; Checking the vector
(println "\nIs 2 in the vector v1? (index of):" (.indexOf v1 2))
(println "Is 2 in vector v2? (index of):" (.indexOf v2 2))
