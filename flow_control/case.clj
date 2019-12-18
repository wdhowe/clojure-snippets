;;; case expression - constant time value matching

(defn myfunc [x]
  (case x
    10 "x is 10!"
    20 "x is 20!"
    "x wasn't matched."))

(println "Checking 20:" (myfunc 20))
(println "Checking 30:" (myfunc 30))

