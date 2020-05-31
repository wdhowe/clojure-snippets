;; Using infinite sequences.

; repeat - return a lazy infinite seq
(println "Using repeat\n"
  (concat (take 3 (repeat "eckee")) ["pakang zoop boing!"]))

; repeatedly - call provided function lazily (as many times as needed)
(println "\nGet random numbers with repeatedly\n"
  (take 5 (repeatedly (fn [] (rand-int 100)))))
