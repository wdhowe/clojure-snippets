; comp - composing a function from others

(defn wrap-in-money [x] (str "$" x "$"))
(defn wrap-in-hash [x] (str "#" x "#"))
(defn wrap-in-exclam [x] (str "!" x "!"))

; compose functions together
(def wrap-it (comp wrap-in-exclam wrap-in-hash wrap-in-money))

(println "Composed function:" (wrap-it "HELLO"))

(println "Same thing, not composed:"
         (wrap-in-exclam (wrap-in-hash (wrap-in-money "HELLO"))))

; another example using an anon function for transforming a number
(def change-num (comp inc #(* % 2)))
(println "\nChange 2:" (change-num 2))