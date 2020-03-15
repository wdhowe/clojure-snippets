; let binds symbols to local scope

; x and y set to the outside/global scope
(def x 1)
(def y 2)

; x and y set to the local scope
(let [x 10 y 20] (def z (+ x y)))

(println "z (result of local let x+y) is:" z)
(println "x and y (outside of local let) are:" x y)
