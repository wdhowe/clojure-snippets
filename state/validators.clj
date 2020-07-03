; validators - specify which values are allowed for an atom/reference.
;              if the validator returns false, an atom's value is not changed.

; create the validator function, should return true or false
(defn battery-level-validator
  "Returns true if battery has a valid power level."
  [power-level]
  (and (>= power-level 0)
       (<= power-level 100)))

; specify a validator to attach to an atom during creation
(def battery (atom 50 :validator battery-level-validator))

(println "Charging battery to 100 percent.")
(swap! battery + 50)

(println "Charging battery 1 more percent to 101. (Invalid reference state expected)")
(swap! battery inc)
