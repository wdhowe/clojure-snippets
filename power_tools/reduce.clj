; reduce - apply a function to the first and second items in a collection
; and get a result. THEN apply the function to the result and the 3rd item.
; Repeat until done.

(def mylist [1 2 3 4 5])

(println
  "Reduce mylist by applying the '+' to each pair (accumulating results):"
  (reduce + mylist))

(println "\nInitial value of 10:" (reduce + 10 mylist))

(println
  "\nCreating a hash-map from a vector."
  (reduce (fn [new-map x] (assoc new-map (keyword x) (rand-int 100)))
    {}
    ["first" "second" "third"]))

(println
 "\nCreating a new hash-map with updated values from an existing map."
 (reduce (fn [new-map [key value]] (assoc new-map key (inc value)))
         {}
         {:first 1 :second 2 :third 3}))
