(ns clojure.examples.myvars (:gen-class))

(defn main
  []
  (def myname "Robert")
  (println "My name is:" myname)
  (def myrate 50.32)
  (println "My hourly rate is:" myrate)
  (def myvar 100)
  (println "My var is:" myvar)
  (def myatomvar (atom 1))
  (println "My atom var is:" @myatomvar)
  (swap! myatomvar inc)
  (println "My atom var is now:" @myatomvar))

(main)
