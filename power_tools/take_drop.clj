;; take and drop: two args, a number and a sequence.
;; take returns the first X elements.
;; drop returns the sequence after X elements have been removed.

(def mynums [1 2 3 4 5 6 7 8 9 10])

(println "Taking 5:" (take 5 mynums))
(println "Dropping 5:" (drop 5 mynums))

;; take-while and drop-while: takes a truthy/falsey function as an
;; argument and the collection. Will continue taking/dropping until
;; function returns false.

(println "Take while < 8:" (take-while (fn [num] (< num 8)) mynums))

(println "Drop while < 8:" (drop-while (fn [num] (< num 8)) mynums))
