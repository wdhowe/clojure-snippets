(ns file_check
  (:gen-class)
  (:require [clojure.java.io :as io]))

(defn main
  []
  (println "Checking for file 'myfile.txt'")
  (println "Does file exist?:" (.exists (io/file "myfile.txt"))))

(main)
