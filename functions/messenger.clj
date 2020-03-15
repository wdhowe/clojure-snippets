; function that can handle zero, 1 or two args
(defn messenger
  ([] (messenger "world!"))
  ([msg] (println "Hello," msg))
  ([msg1 msg2] (println msg1 msg2)))

; call with no args
(messenger)

; call with an argument
(messenger "Bob")

; call with two arguments
(messenger "the" "Bob")
