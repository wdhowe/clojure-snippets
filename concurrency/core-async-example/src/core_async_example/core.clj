;; The Pandemic Vending Machine
;; Inspired by Clojure for the Brave and True's 'Hot Dog Vending Machine'.
;; Used to test/learn about core.async.

(ns core-async-example.core
  (:require [clojure.core.async
             :as a
             :refer  [>! <! >!! <!! go chan close!]])
  (:gen-class))

;---------------------------------------
; chan - create a new channel that messages can be put/taken to/from.

; parking put/take (!) - interleave processes on/off threads while waiting.
; can ONLY be used inside go blocks.
; >! 'put' a message onto a channel (wait for message to be taken)
; <! 'take' a message from a channel (wait for message to be put)

; blocking put/take (!!) - block/stop process while waiting.
; inside or outside of go blocks.
; >!! 'put' used outside of go block. (wait for message to be taken)
; <!! 'take' used outside of go block. (wait for message to be put)

; go - Runs containing code concurrently and on separate threads.

; thread - Similar to 'future', execute a process on a new thread, but
;          returns a channel. A processes return value is put on the
;          channel that thread returns.
;          Use instead of go if processes are long running in order
;          to avoid exhausting thread pools.
;---------------------------------------

(defn pandemic-vending-machine
  "The most important item money can buy during a pandemic."
  [total-inv] ; total inventory count the machine is created with.

  ; create the in/out channels
  (let [in (chan)
        out (chan)]

    ; go block - execute concurrently on threads
    (go (loop [cur-inv total-inv]

          (if (> cur-inv 0)
            ; there is inventory, take from the in channel
            (let [input (<! in)]
              ; validate input sent
              (if (= 1 input)
                ; valid input - output item, reduce inv, recur
                (do (>! out "Whirr..kachunk: roll of toilet paper")
                    (recur (dec cur-inv)))
                ; not valid input - output error, recur
                (do (>! out "Exact amount only: $1.")
                    (recur cur-inv))))

            ; cur-inv not > 0, close channels
            (do (close! in)
                (close! out))))) ; end of go block

    [in out])) ; return the channels

(defn vend-item
  "Vend/get my item."
  [chan-out]
  ; 'take' from the out channel.
  (<!! chan-out))

(defn insert-money
  "Insert money and get an item."
  [amount chan-in chan-out]
  ; 'put' on the in channel an amount.
  (>!! chan-in amount)
  (vend-item chan-out))

(defn -main
  "It's a pandemic! Get ALL the toilet paper!"
  ([] (-main 5))
  ([starting-inv]
   (println "Buying up some toilet paper. It's a pandemic after all.")

  ; create a vending machine with an initial inventory count. 
  ; destructure the return vector to local symbols.(in/out)
   (let [[in out] (pandemic-vending-machine starting-inv)]
    ; insert an invalid dollar amount (2) and show result.
     (println "Insert $2:")
     (println "Result:" (insert-money 2 in out))

    ; insert a valid dollar amount (1) and show result.
     (println "Insert $1")
     (println "Result:" (insert-money 1 in out))

     (println "Insert $1")
     (println "Result:" (insert-money 1 in out)))))

; comment blocks make for good places to test as you go.
; they also provide execution examples.
(comment
  (-main)
  (-main 1)
  (-main 5))