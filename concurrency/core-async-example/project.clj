(defproject core-async-example "0.1.0-SNAPSHOT"
  :description "Learning core.async via a simple vending machine."
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "1.2.603"]]
  :main ^:skip-aot core-async-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
