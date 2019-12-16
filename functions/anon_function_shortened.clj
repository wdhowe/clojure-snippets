; anonymous functions (lambda) short form
; nesting not allowed

; % -> single parameter
; %1, %2 -> multiple parameters
; %& -> remaining parameters

; println's added for output readability

; same as: ( (fn [x] (+ 10 x)) 2)
( println( #(+ 10 %) 2) )

; same as: ( (fn [x y] (+ x y)) 2 5)
( println( #(+ %1 %2) 2 5) )

; same as: ( (fn [x y &z] (println x y z)) 2 5 10 12)
( #(println %1 %2 %&) 2 5 10 12)

