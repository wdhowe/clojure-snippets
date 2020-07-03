(ns clojure.examples.myvars (:gen-class))

; symbols bound via def are global.
(def earth "round")

; symbols bound via let are local to that function.
(defn main
  []
  (let [myname "Robert"
        myrate 50.32
        myvar 100]
    (println "My name is:" myname)
    (println "My hourly rate is:" myrate)
    (println "My var is:" myvar)
    (println "Earth is:" earth)))

(main)
(println "Earth is still:" earth)
