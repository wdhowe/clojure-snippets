; loop - a by-hand loop expression.
; typically avoid and use built-ins like map, filter, reduce
; Similar to a let expression: setup local vars in a binding vector.
; The body is executed, you either exit with some value or loop again
; with 'recur'

;; recur on defn
(defn increase
  "Recur on own function defn."
  [i]
  (if (< i 10) (recur (inc i)) i))

(println (increase 5))
(println (increase 1))
(println (increase 100))

;; loop,recur vector accumlation example
(defn accum-numbers
  "Accumulate numbers into a vector, up to the max passed in."
  [themax]
  ; loop expression with initial bound variables
  (loop [accum []
         x 1]
    ; if x is > themax, return the accumulated result
    (if (> x themax)
      accum
      ; otherwise, call loop again with new args
      (recur (conj accum x) (inc x)))))

(def results (accum-numbers 15))
(println results)
