(ns clojure.examples.myvars (:gen-class))

(defn main
  []
  (let [myname "Robert"
        myrate 50.32
        myvar 100
        myatomvar (atom 1)]
    (println "My name is:" myname)
    (println "My hourly rate is:" myrate)
    (println "My var is:" myvar)
    (println "My atom var is:" @myatomvar)
    (swap! myatomvar inc)
    (println "My atom var is now:" @myatomvar)))

(main)
