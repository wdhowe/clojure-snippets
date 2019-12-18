;;; cond - series of conditional tests/expressions

(def mynum 30)

; return the first matched condition
(cond
      (< mynum 50) (println "Less than 50!")
      (< mynum 60) (println "Less than 60!")
      :else (println "Larger than 60!") )

