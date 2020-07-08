; commonly used java interop

; system class
(println "All env vars:\n" (System/getenv))
(println "\nhome:" (System/getenv "HOME"))
(println "\nPATH:" (System/getenv "PATH"))

; date class
(import [java.util Date])
(println "\nDate literal:" (Date.))
