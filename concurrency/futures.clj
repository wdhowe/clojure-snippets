; futures - define a task and start execution on another thread.
;           does not require a return immediately.
;           a timeout can be defined to not wait forever during deref.

(future (Thread/sleep 2000)
        (println "Hello from the future!"))
(println "Hello now.")

; deref a symbol that a future is bound to request its result/return value.
; if the future hasn't finished, execution stops while you wait for the result.

(let [future-result (future (println "This happens once.")
                            {:thefuture "is now"})]
  (println "first deref:" (deref future-result))
  (println "second deref (with '@'):" (:thefuture @future-result)))

(println "\nTimeout example")
; timeout at 300 ms, then return form after it. (the str)
(println (deref (future (Thread/sleep 3000) (str "You waited long enough.")) 300 (str "I got bored waiting.")))
