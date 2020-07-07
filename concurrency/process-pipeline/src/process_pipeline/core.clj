(ns process-pipeline.core
  (:require [clojure.core.async
             :as a
             :refer  [>! <! >!! <!! go chan close!]])
  (:gen-class))

(def mydata [{:x 100 :y 200} {:x 110 :y 210} {:x 120 :y 220}])

(defn grab-first
  "Takes the first item in a seq from the in channel.
   Return result on the out channel."
  [in]
  (let [out (chan)]
    (go (while true (>! out (first (<! in)))))
    out))

(defn add-them
  "Add all values from the in channel.
   Return result on the out channel."
  [in]
  (let [out (chan)]
    (go (while true (>! out (reduce + (vals (<! in))))))
    out))

(defn print-it
  "Print values taken on the in channel."
  [in]
  (go (while true (println (<! in)))))

(defn -main
  "Simple process pipeline example."
  []
  ; construct the process pipeline in the let block.
  (let [chan-in (chan)
        first-data (grab-first chan-in)
        added-data (add-them first-data)]
    (print-it added-data)

    ; Send data through the transformation pipeline.
    (println "Data before:" mydata)
    (>!! chan-in mydata)))

(comment
  (-main))