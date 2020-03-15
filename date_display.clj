;;;; Examples displaying date objects
(ns date-display)

(defn -main
  []
  (let [date-year (.format (java.text.SimpleDateFormat. "yyyy-MM-dd")
                           (new java.util.Date))
        date-time (.format (java.text.SimpleDateFormat. "yyyy-MM-dd HH:mm")
                           (new java.util.Date))]
    (println "Date is: " date-year)
    (println "Date with time is: " date-time)))

(-main)