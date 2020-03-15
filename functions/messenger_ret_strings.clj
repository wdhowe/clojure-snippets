; function that can handle zero, 1 or two args
(defn messenger
  ([] (messenger "world!"))
  ([msg] (str "Hello, " msg))
  ([msg1 msg2] (str msg1 msg2)))

; call with no args
(println (messenger))

; call with an argument
(println (messenger "Bob"))

; call with two arguments
(println (messenger "the" "Bob"))

;; testing with assert
(println "Assertion tests below (nil is good/no error)")
(println (assert (= "Hello, world!" (messenger))))
(println (assert (= "Hello, Bob" (messenger "Bob"))))
(println (assert (= "the Bob" (messenger "the" " Bob"))))
