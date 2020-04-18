(ns config-test.core
  (:require [clojure.java.io :as io])
  (:gen-class))

(def home-dir (str (System/getProperty "user.home") "/"))

(defn load-config
  "Load configuration from an edn file."
  [filename]
  (with-open [f (io/reader (str home-dir filename))]
    (read (java.io.PushbackReader. f))))

(defn -main
  "Using edn(extensible data notation) for configuration."
  []
  (let [config (load-config "person.edn")
        my-name (:myname config)
        my-age (:myage config)]
    (println "-> My loaded config:" config
             "\n-> My name:" my-name
             "\n-> My age:" my-age)))
