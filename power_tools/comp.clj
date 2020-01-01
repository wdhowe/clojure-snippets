; comp - composing a function from others

(defn wrap-in-money [x] (str "$" x "$"))
(defn wrap-in-hash [x] (str "#" x "#"))
(defn wrap-in-exclam [x] (str "!" x "!"))

; compose functions together
(def wrap-it (comp wrap-in-exclam
                   wrap-in-hash
                   wrap-in-money))

(println "Composed function:"
    (wrap-it "YO")
)

(println "Same thing, not composed:"
    (wrap-in-exclam (wrap-in-hash (wrap-in-money "YO")))
)