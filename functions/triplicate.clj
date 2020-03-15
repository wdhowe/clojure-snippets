; triplicate - take a function as an arg and execute it 3 times
(defn triplicate [f] (f) (f) (f))

; function to test triplicate
(defn printit [] (println "HI there"))

(triplicate printit)
