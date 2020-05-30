; map applies a function to every value in a collection

(def mylist (vector 1 2 3 4 5))
(def mylist2 (vector :a :b :c :d :e :f :g :h :i :j))

; increment all items in a vector
(println (map inc mylist))

; map a lambda function to a vector's values
(println (map (fn [x] (* x x)) mylist))

; map a function across two collections, stop automatically
; when the shorter collection runs out of items
; uses "into []" to convert the returned list seq back to a vector.
(println (into [] (map (fn [x y] (str x " " y)) mylist2 mylist)))
