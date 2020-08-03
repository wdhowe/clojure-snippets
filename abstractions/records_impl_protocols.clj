;; Example of implementing a protocol in a record and
;; extending a protocol's functionality with a new protocol.

; initial protocol definition
(defprotocol PandemicVend
  "Determine which type of product to vend."
  (buy-tp [this payment] "Buy toilet paper.")
  (buy-meat [this payment] "Buy some meat.")
  (buy-bleach [this payment] "Buy some bleach."))

; implement the protocol with a record data type
(defrecord VendingMachine [id]
  PandemicVend
  (buy-tp [this payment]
    (if (= payment 2.00)
      (str "[" id "] Whirr..tp dispensed.")
      (str "[" id "] Buzz! Tp is $2.00. (not $" (format "%.2f" payment) ")")))
  (buy-meat [this payment]
    (if (= payment 5.00)
      (str "[" id "] Whirr..meat dispensed.")
      (str "[" id "] Buzz! Meat is $5.00. (not $" (format "%.2f" payment) ")")))
  (buy-bleach [this payment]
    (if (= payment 3.50)
      (str "[" id "] Whirr..bleach dispensed.")
      (str "[" id "] Buzz! Bleach is $3.50. (not $" (format "%.2f" payment) ")"))))

; define a new protocol for new functionality
(defprotocol Refunder
  (refund-money [this amount] "Determine if money should be refunded."))

; extend the existing protocol to add new functionality,
; implemented via the existing record type
(extend-protocol Refunder
  VendingMachine
  (refund-money [this amount] "A complex algorithm to refund money or not."
    (if (< 5 (rand-int 10))
      (str "Refund denied. Say goodbye to your $" amount)
      (str "Refund approved. Dispensing $" amount))))

(println "Buy some stuff!")
(def my-machine (->VendingMachine 4321))
(println "Machine id:" (:id my-machine))
(println (buy-tp my-machine 2.00))
(println (buy-meat my-machine 5.00))
(println (buy-bleach my-machine 3.00))
(println (buy-bleach my-machine 3.50))

(def his-machine (->VendingMachine 1234))
(println "\nMachine id:" (:id his-machine))
(println (buy-tp his-machine 1.00))
(println "Attempt a refund:")
(println (refund-money his-machine 3.00))
