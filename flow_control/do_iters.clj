;; iterations using dotimes and doseq

; mynum used in iterations below
(def mynum 5)

; dotimes - evaluate an expression 'mynum' times
(println "dotimes iteration")
(dotimes [i mynum]
  (println i) )

; doseq - iterate over a sequence
(println "\ndoseq iteration")
(doseq [x (range mynum)]
  (println x) )

; sequential vector/list for doseq below
(def myvector (vector 1 2 3))
(def mylist '(5 "pizza" "something"))

(println "\ndoseq over a vector")
(doseq [x myvector]
  (println x))

(println "\ndoseq over a list")
(doseq [x mylist]
  (println x))

(println "\ndoseq over multiple sequences (like a nested for loop)")
(doseq [outer mylist
        inner myvector]
  (println [outer inner]) )

