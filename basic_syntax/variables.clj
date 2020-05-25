(ns clojure.examples.myvars (:gen-class))

; symbols bound via def are global.
(def earth "round")

; symbols bound via let are local to that function.
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
    (println "My atom var is now:" @myatomvar)
    (println "Earth is:" earth)))

(main)
