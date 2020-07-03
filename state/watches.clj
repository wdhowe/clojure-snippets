; watches - keep track of a reference type to track changes.

; 0) pre-req: create an atom
(def battery (atom 50))

; 1) create a watch function, requires 4 arguments:
;    a) key to use for reporting
;    b) the atom being watched
;    c) state of atom before the change
;    d) state of atom after the change

(defn battery-alert
  "Alerts when battery is less than 20 percent."
  [key watched current-state new-state]
  (let [power-level new-state]
    (if (< power-level 20)
        (println "Warning! Battery level low! (" power-level ")")
        (println "Battery level ok."))))

; 2) add a watch to the watch function, requires 3 arguments:
;    a) atom/reference
;    b) key for reporting
;    c) the watch function
(add-watch battery :power battery-alert)

(println "Changing battery power level, not below threshold.")
(swap! battery - 25)

(println "\nChanging battery power level, below the threshold.")
(swap! battery - 15)