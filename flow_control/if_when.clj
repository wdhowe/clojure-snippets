;;; if..then expression

(def mynum -100)
;                   if (test condition) then  else
(println mynum "is" (if (even? mynum) "even" "odd"))

(println mynum "< 50?" (if (< mynum 50) "smallish" "large-ish"))

; if expression without the optional "else"
(println "is true, false?" (if (true? false) "impossible!"))

;;; when expression - if with explicitly only a "then", no else

(when (neg? mynum)
  (println "I'm pretty sure its negative, but I'm not positive."))
