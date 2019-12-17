; function that returns two functions composed together
(defn two-fns [f g]
  ; call g with x, then f with that result
  (fn [x] (f (g x)) )
)

(defn add-some [x]
  (+ x 100)
)

(defn sub-some [x]
  (- x 10)
)

(def myvalue (two-fns add-some sub-some))
; call both functions on the passed in arg
(println (myvalue 50) )

