; atoms - allow for associating a value with an identity and then
;         changing the identity to refer to a new value.

; swap! compares current value with the new value
; this ensures no swaps are lost in a concurrent situation
(def myatomvar (atom 1))
(println "My atom var is:" @myatomvar)
(swap! myatomvar inc)
(println "After swap! inc, my atom var is now:" @myatomvar)

; reset! is used when you don't care about the current value and
; just want the value changed now.
(reset! myatomvar 0)
(println "After reset!, myatomvar is now:" @myatomvar)
