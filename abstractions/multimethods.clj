; multimethods - a dispatching function determines which function to call
;                based on the result of the dispatch output.
;                all functions have the same name, but different implementations.

; the multimethod dispatch function - output selects the function to run.
(defmulti pandemic-vend
  "Determine which product to vend."
  (fn [vend-item] (:name vend-item)) :default "default")

; same name, different function implementations.
(defmethod pandemic-vend "tp"
  [vend-item]
  (str "'" (:brand vend-item) "' " (:name vend-item) " is super rare. You are lucky, we have 1 left."))

(defmethod pandemic-vend "meat"
  [vend-item]
  (str "'" (:brand vend-item) "' " (:name vend-item) " is delicious. Freeze a bunch up for when the plants shutdown."))

(defmethod pandemic-vend "bleach"
  [vend-item]
  (str "WARNING! Do NOT inject '" (:brand vend-item) "' " (:name vend-item) " into your body."))

(defmethod pandemic-vend "default"
  [vend-item]
  (str "Hmm, sorry. Fresh out of '" (:brand vend-item) "' " (:name vend-item) "."))

(println "Testing multimethods:")
(println (pandemic-vend {:name "tp" :brand "Wipem"}))
(println (pandemic-vend {:name "meat" :brand "Its Real"}))
(println (pandemic-vend {:name "bleach" :brand "Not My Eyes"}))
(println (pandemic-vend {:name "medicine" :brand "Cure Me"}))
