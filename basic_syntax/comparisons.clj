; comparisons

(defn do-compare
  []
  (println "Equality:" (= 7 7))
  (println "Not Equality:" (not= 7 7))
  (println "Less than:" (< 7 8))
  (println "Greater than:" (> 7 8))
  (println "And op:" (and true false))
  (println "Or op:" (or true false))
  (println "Not op:" (not false)))

(do-compare)
