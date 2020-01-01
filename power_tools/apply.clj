; apply - allows you to call a function that normally takes
; individual args, and pass it a collection

(def mylist (vector 10 20 30 40 50 60))

; (max mylist) ;; won't work

(println "Max of:" mylist)
(println (apply max mylist) )

(println "\nMax of:" mylist "and extras:" 35 100)
(println (apply max 35 100 mylist) )
