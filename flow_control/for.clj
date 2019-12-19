;; Clojure's for is a list comprehension, NOT a for loop
; behaves like doseq

; sequential lists for below
(def mylist '(5 "pizza" "something"))
(def mylist2 '(10 "pie" "other"))

(def newseq
  (for [outer mylist
        inner mylist2]
    [outer inner] ) 
)

(println "New seq via for is:" newseq)

