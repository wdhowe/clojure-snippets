(ns fizz-buzz2
  "The Fizz Buzz challenge
   Write a program that prints the numbers from 1 to 20.
   For multiples of 3 print 'fizz' instead of the number,
   for multiples of 5 print 'buzz' instead of the number, and
   for multiples of 3 and 5, print 'fizzbuzz' instead of the number.
   This code is a combination of the 'Source' blogpost and the comment section.
   Source: https://blog.klipse.tech/clojure/2020/09/11/fizbuzz-clj.html")

(defn fizzes [] (cycle ["" "" "fizz"]))

(defn buzzes [] (cycle ["" "" "" "" "buzz"]))

(defn fizz-buzz-cycle [] (map str (fizzes) (buzzes)))

(defn one->infinity [] (map str (rest (range))))

(defn fizzbuzz
  [n] 
  (take n
    (map #(some not-empty %&) ; return the first non-empty string for each position in the cycle
          (fizz-buzz-cycle) (one->infinity))))

(def my-num 15)
(println "fizzbuzz" my-num)
(println (fizzbuzz my-num))
