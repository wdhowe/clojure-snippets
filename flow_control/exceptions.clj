; Exception handling

(def x 10)
(def y 0)

; try/catch/finally similar to Java
(try (/ x y)
     (catch ArithmeticException e (println "divide by zero"))
     (finally (println "cleanup")))

; throwing exceptions
(try (throw (Exception. "something bad happened"))
     (catch Exception e (.getMessage e)))
