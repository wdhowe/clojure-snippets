;; The Fizz Buzz challenge
;; Write a program that prints the numbers from 1 to 20.
;; For multiples of 3 print "Fizz" instead of the number,
;; for multiples of 5 print "Buzz" instead of the number, and
;; for multiples of 3 and 5, print "FizzBuzz" instead of the number.
;; Original idea from: https://clojuredocs.org/clojure.core/cond-%3E#example-570c2e57e4b0fc95a97eab4a

(defn divisible?
  "Determine if a number is divisible by the divisor with no remainders."
  [div num]
  (zero? (mod num div)))

(defn fizz-buzz
  "Fizz if divisible by 3, Buzz if divisible by 5, FizzBuzz if div by both, n if neither."
  [n]
  (cond-> nil ; threaded value starts with nil (falsey)
    (divisible? 3 n) (str "Fizz") ; if true, adds Fizz to the threaded value (nil)
    (divisible? 5 n) (str "Buzz") ; if true, adds Buzz to the threaded value (nil or Fizz)
    :always-true     (or n))) ; return the threaded value if truthy (not nil, ie: Fizz/Buzz) or n

(let [start 1
      stop 20]
  (println "FizzBuzz:" start "-" stop)
  (doseq [x (range start (+ 1 stop))] (println (fizz-buzz x))))