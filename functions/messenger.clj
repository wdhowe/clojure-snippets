; function that can handle zero or 1 argument
(defn messenger
  ([] (messenger "world!"))
  ([msg] (println "Hello," msg))
)

; call with no args
(messenger)

; call with an argument
(messenger "the Bob")
