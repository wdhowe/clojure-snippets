(ns pluggable-functions.alt
  (:gen-class)
  (:require [pluggable-functions.protos :as protos]))

(defrecord process-alt [id]
  protos/process-things
  (process-stuff [this stuff] "Process stuff."
    (str "Processing alt stuff: " id " " stuff))
  (process-that [this that] "Process that."
    (str "Processing alt that: " id " " that))
  (process-another [this another] "Process another."
    (str "Processing alt another: " id " " another)))
