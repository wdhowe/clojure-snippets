; promises - define a placeholder for a result.
;            deliver the task/result to that placeholder in the future.
;            a timeout can be defined to not wait forever during deref.
;            promises are useful when combined with futures.

(def myresult (promise))

; promises can only be delivered once.
(deliver myresult (str "I promised this."))
(println "My result is:" @myresult)

(deliver myresult (str "I promised this too, but that won't change anything."))
(println "My result again is:" @myresult)

; promise with timeout
(println "\nPromise with timeout example.")
(let [my-promise (promise)]
  (println (deref my-promise 300 "Waited too long for undelivered promise.")))

;;;;----------;;;;
(println "\npromise+future example")

(def joblist ["job1" "job2" "job3"])

(defn process-job
  [job]
  (let [rand-sleep (* 500 (rand-int 10))]
    (Thread/sleep rand-sleep)
    (println "Processed job:" job)
    true))

(defn show-done
  [msg]
  (println msg))

(let [first-done (promise)]
  (doseq [job joblist]
    (future (process-job job)
            (deliver first-done job)))
  (println ">> First job done is:" @first-done))
