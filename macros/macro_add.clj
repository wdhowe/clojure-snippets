; macro_add
; Simple macro example to add the first/last of a vector of numbers.

; Example 1: add-first-last
; Uses syntax quoting backtick (`) to return unevaluated symbols.
; The tilde (~) forces evaluation (unquotes) inside of the syntax quoted form.

(defmacro add-first-last
  "Adds the first and last numbers."
  [nums]
  `(+ ~(first nums) ~(last nums)))

(println "Example 1")
(println (add-first-last [10 20 30 40 50]))
(println (add-first-last [60 70 80 90 100]))


; Example 2: add-first-last2
; Build the list without syntax quoting.
; Use single quoting (') to return unevaluated symbols.

(defmacro add-first-last2
  "Adds the first and last numbers without syntax quoting."
  [nums]
  (list '+ (first nums) (last nums)))

(println "Example 2")
(println (add-first-last2 [10 20 30 40 50]))