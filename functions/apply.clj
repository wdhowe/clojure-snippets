; apply - unwinds a sequence data structure so
;         each item can be passed as an arg to a function.

(def mylist (vector 10 20 30 40 50 60))

; (max mylist) ;; won't work, max expects x & rest variables

(println "Max of:" mylist)
(println (apply max mylist))

(println "\nMax of:" mylist "and extras:" 35 100)
(println (apply max 35 100 mylist))
