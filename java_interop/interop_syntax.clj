; interop_syntax - basic intro to java interop.
;
; call java methods via:
; (.methodName object)

; string examples
(println (.toLowerCase "HELLO WORLD!"))
(println (.toUpperCase "hello world."))

; java Math class
; more at: https://www.javatpoint.com/java-math
(println (java.lang.Math/sqrt 64))
(println (java.lang.Math/PI))
(println (java.lang.Math/pow 2 4))
