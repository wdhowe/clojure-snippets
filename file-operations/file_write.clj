(ns file-write
  (:gen-class)
  (:require [clojure.java.io :as io]))

; with-open uses exception handling and auto closes files
(with-open [f (io/writer "testfile.txt")] (.write f "test text"))
