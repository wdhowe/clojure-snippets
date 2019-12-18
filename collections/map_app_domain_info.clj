; domain information via maps

(def jedi
  {:name "Yoda"
   :lightsaber "green"
   :height "very small"
   :job "Jedi Sage"
  })

(println "Mapped domain info:" jedi)
(println "Lookup name with get:" (get jedi :name))
(println "Lookup height with execution:" (jedi :height))

(println "\nLookup job via keyword:" (:job jedi))
(println "Lookup non-existent key via keyword, backup default:" (:food jedi "the force"))

(println "\nUpdating height:" (assoc jedi :height "2 feet"))
(println "Removing job:" (dissoc jedi :job))

