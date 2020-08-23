(ns pluggable-functions.core
  (:gen-class)
  (:require [clojure.tools.logging :as log]
            [environ.core :as environ]
            [pluggable-functions.protos :as protos]
            [pluggable-functions.functions :as functions]))

(def config
  "Load configuration from the environment."
  {:function-lib (or (:function-lib environ/env) :default)})

(comment (println "Config is:" config))

(defn -main
  "Running functions (mapping a record) based on environment variable."
  []
  (log/info "Config is:" config)
  (let [my-record ((functions/get-func config) 123)]
    (println (protos/process-stuff my-record "process stuff."))
    (println (protos/process-that my-record "process that."))
    (println (protos/process-another my-record "process another."))))
