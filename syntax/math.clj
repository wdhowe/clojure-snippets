(ns clojure.examples.math
  (:gen-class))

(defn do-math []
  (println "Addition:" (+ 7 7))
  (println "Subtraction:" (- 7 7))
  (println "Multiplication:" (* 7 7))
  (println "Division:" (/ 7 7))
  (println "Increment:" (inc 7 ))
  (println "Decrement:" (dec 7 ))
  (println "Find max:" (max 7 8 3))
  (println "Find min:" (min 7 8 3))
)

(do-math)

