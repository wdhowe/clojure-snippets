(ns pluggable-functions.functions
  (:gen-class)
  (:require [pluggable-functions.default]
            [pluggable-functions.alt]))

(def registry
  "A mapping of keywords to functions and arguments."
  {:default {:func #'pluggable-functions.default/->process-default
             :args nil}
   :alt     {:func #'pluggable-functions.alt/->process-alt
             :args nil}})

(comment ((:function-lib {:function-lib :default}) registry)
         ((:function-lib {:function-lib :alt}) registry))

(defn get-func
  "Get the function from the registry, based on config."
  [conf]
  (let [func-kw (keyword (:function-lib conf))]
    (get-in registry [func-kw :func])))

(comment (get-func {:function-lib :default})
         (get-func {:function-lib "alt"}))
