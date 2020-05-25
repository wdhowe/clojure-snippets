;; if, do, when operators.

; symbol for testing
(def mynum -100)

;; if

; (if test-condition
;   (then)
;   (optional-else))
(if (even? mynum)
  (println "My num is even.")
  (println "My num is odd."))

;; do
(if (even? mynum)
  (do (println "\nIt is even.")
      (println "...Steven."))
  (do (println "It is odd.")
      (println "...Todd.")))

;; when - combination of if/do with no else

(when (neg? mynum)
  (println "\nI'm pretty sure its negative, but I'm not positive.")
  (println "Anything else?"))
