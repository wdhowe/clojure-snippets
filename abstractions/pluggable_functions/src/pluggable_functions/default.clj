(ns pluggable-functions.default
  (:gen-class)
  (:require [pluggable-functions.protos :as protos]))

(defrecord process-default [id]
  protos/process-things
  (process-stuff [this stuff] "Process stuff."
    (str "Processing default stuff: " id " " stuff))
  (process-that [this that] "Process that."
    (str "Processing default that: " id " " that))
  (process-another [this another] "Process another."
    (str "Processing default another: " id " " another)))
