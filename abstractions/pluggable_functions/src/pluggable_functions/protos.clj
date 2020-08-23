(ns pluggable-functions.protos
  (:gen-class))

(defprotocol process-things
  (process-stuff [this stuff] "Process stuff.")
  (process-that [this that] "Process that.")
  (process-another [this another] "Process another."))