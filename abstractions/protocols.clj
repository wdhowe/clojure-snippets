; protocols - similar to multimethods, but dispatch based on the type of
;             the first argument to the function.

; The protocol and function signatures.
; protocol has the protocol name and docstring.
; signatures have the function name, arguments, and docstring.
(defprotocol pandemic-vend
  "Determine which type of product to vend."
  (buy-tp [payment] "Buy toilet paper.")
  (buy-meat [payment] "Buy some meat.")
  (buy-bleach [payment] "Buy some bleach."))

; define how the protocol is implemented by type.
; implement a protocol by extending the protocol and then
; specifying a Java data type.
; if a type is extended/implemented, every function must be implemented.
(extend-protocol pandemic-vend
  java.lang.Double
  (buy-tp [payment]
    (if (= payment 2.00)
      (str "Whirr..tp dispensed.")
      (str "Buzz! Tp is $2.00. (not $" (format "%.2f" payment) ")")))
  (buy-meat [payment]
    (if (= payment 5.00)
      (str "Whirr..meat dispensed.")
      (str "Buzz! Meat is $5.00. (not $" (format "%.2f" payment) ")")))
  (buy-bleach [payment]
    (if (= payment 3.50)
      (str "Whirr..bleach dispensed.")
      (str "Buzz! Bleach is $3.50. (not $" (format "%.2f" payment) ")"))))

(println "Buy some stuff!")
(println (buy-tp 2.00))
(println (buy-meat 5.00))
(println (buy-bleach 3.00))
(println (buy-bleach 3.50))
