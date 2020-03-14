; with-open uses exception handling and auto closes files
(with-open [f (clojure.java.io/writer "testfile.txt")]
  (.write f "test text")
)

