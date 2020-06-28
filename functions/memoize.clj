; memoize - remember result of function calls

(defn tired-addition
  "Adds 100...eventually."
  [num]
  (Thread/sleep 3000)
  (+ num 100))

; memoize a long running/computationally intensive function
(def memo-tired-addition (memoize tired-addition))

(println "Function call the first time.")
(println (time (memo-tired-addition 10)))

(println "Function call the second time.")
(println (time (memo-tired-addition 10)))
