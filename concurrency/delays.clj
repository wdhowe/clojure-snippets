; delays - define a task but do NOT start execution until force/deref.
;          delays are use when combined with futures.

(def delay-result
  (delay (let [my-message "Don't delay, send today."]
           (println "I have executed.")
           my-message)))

(println "delay-result has been defined previously.")
(println "force eval now:" (force delay-result))

;;;----------;;;;
; delay body processed once, return value cached.
(println "\ndelay+future example")

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

(let [first-done (delay (show-done "First item processed."))]
  (doseq [job joblist]
    (future (process-job job)
            (force first-done))))
