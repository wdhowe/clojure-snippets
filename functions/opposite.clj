; return a function that negates the passed in function
(defn opposite [f] (fn [& any] (not (apply f any))))

; true if both x and y are smaller than 100
(defn smaller [x y] (and (< x 100) (< y 100)))

(def notsmaller (opposite smaller))

(println (notsmaller 1000 80))
