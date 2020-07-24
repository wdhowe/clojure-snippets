;; pre and post conditions - enforce conditions and throw
;; exceptions if they are not met.

(defn process-this
  "Does some important processing."
  [my-data]
  {:pre [(:stuff my-data) (:things my-data)]
   :post [(map? %)]}
  (println "Doing things with:" my-data)
  {:result (str "complete - " (first (:stuff my-data)))}) ; returns a map, satisfying the post condition

; satisfies the pre and post conditions, no errors.
(println (process-this {:stuff "somestuff is here" :things "things are here"}))

; assertion error, missing :things key in the pre condition
(println (process-this {:stuff "somestuff is here 2"}))