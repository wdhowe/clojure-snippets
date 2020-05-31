; map applies a function to every value in a collection

(def mylist (vector 1 2 3 4 5))
(def mylist2 (vector :a :b :c :d :e :f :g :h :i :j))

; increment all items in a vector
(println "Items incremented\n" (map inc mylist))

; map a lambda function to a vector's values
(println "Lambda func mapped\n" (map (fn [x] (* x x)) mylist))

; map a function across two collections, stop automatically
; when the shorter collection runs out of items
; uses "into []" to convert the returned list seq back to a vector.
(println "Mapped across two vectors\n" (into [] (map (fn [x y] (str x " " y)) mylist2 mylist)))

; map to create a hash-map that combines two vectors
(def high-temps [85 89 87 90 93])
(def low-temps [45 50 48 60 65])

(defn match-temps
  "Match up temps."
  [low high]
  {:low low
   :high high})

(println "\nTemperature mappings\n" (map match-temps low-temps high-temps))
