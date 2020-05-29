;; multi-arity - function that treats different num of arguments in unique ways

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

;; running tests with assert
(println "\nAssertion tests below (nil is good/no error)")
(println (assert (= "Hello, world!" (messenger))))
(println (assert (= "Hello, Bob" (messenger "Bob"))))
(println (assert (= "the Bob" (messenger "the" " Bob"))))
