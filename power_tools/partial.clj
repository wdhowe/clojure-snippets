; partial - use to pass standard arguments, along with other supplied args

; original function
(defn origfunc [a b c d] (map (fn [x] (str x "->")) [a b c d]))

; variable to pass a few standard args always
(def newfunc (partial origfunc 2 4 6))

(println "Original function directly:" (origfunc 1 2 3 4))

(println "Original function through partial:" (newfunc 100))
