;; Anonymous functions (Lambda)

;; Normal form

; simple example
(println "Multiply Example:" ((fn [x] (* x 3)) 50))

; Using anon fn as return values.
(defn my-inc
  "Custom incrementor."
  [increase-by]
  (fn [num] (+ num increase-by)))

(def inc10 (my-inc 10))

(println "\nStart with 20, then custom inc:" (inc10 20))

;; Short form - nesting not allowed
; % -> single parameter
; %1, %2 -> multiple parameters
; %& -> remaining parameters

; same examples as above, but in shorthand form.
(println "\nMultiply Example:" (#(* % 3) 50))

(defn my-inc2
  "Custom incrementor."
  [increase-by]
  #(+ %1 increase-by))

(def inc20 (my-inc2 20))

(println "\nStart with 20, then custom inc:" (inc20 20))
