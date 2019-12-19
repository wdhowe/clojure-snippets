;; recur and sequence abstraction

; loop and recur
; loop -> defines bindings
; recur -> re-executes the loop with new bindings
(println "loop and recur")

(loop [i 0]
  (if (< i 5)
    (recur (inc i)) ;re-execute loop
    (println i) )
)

; defn and recur
; arguments are implicit loop bindings
(println "\ndefn and recur")

(defn increase [i]
  (if (< i 10)
    (recur (inc i))
  i)
)

(println (increase 5) )
(println (increase 1) )
(println (increase 100) )
