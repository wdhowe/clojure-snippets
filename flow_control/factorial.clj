;; using iterative recursion to solve factorials

(defn factorial-iter [count, total]
  (if (= count 1)
    total
    (factorial-iter (- count 1) (* total (- count 1)))))

(defn factorial [num]
  (factorial-iter num num))

(println (factorial 4) )
