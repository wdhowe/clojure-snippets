; reduce - apply a function to the first and second items in a collection
; and get a result. THEN apply the function to the result and the 3rd item.
; Repeat until done.

(def mylist [1 2 3 4 5])

(println "Reduce mylist by applying the '+' to each pair (accumulating results):"
    (reduce + mylist) )

(println "\nInitial value of 10:"
    (reduce + 10 mylist) )

(println "\nAccumulating a data structure"
    (reduce (fn [item x]
              (assoc item
              (keyword x)
              (str x \- (rand-int 100)) )
            )
        ; the first arg(item), an empty map
        {}
        ; the second arg(x), a vector
        ["first" "second" "third"]
    )
)