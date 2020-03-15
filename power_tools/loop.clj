; loop - a by-hand loop expression.
; typically avoid and use built-ins like map, filter, reduce
; Similar to a let expression: setup local vars in a binding vector.
; The body is executed, you either exit with some value or loop again
; with 'recur'

(defn dostuff
  [themax]
  ; loop expression with initial bound variables
  (loop [accum []
         x 1]
    ; if x is > themax, return the accumulated result
    (if (> x themax)
      accum
      ; otherwise, call loop again with new args
      (recur (conj accum x) (inc x)))))

(def stuffresults (dostuff 15))
(println stuffresults)
