(defproject pluggable_functions "0.1.0-SNAPSHOT"
  :description "Concept showing running functions from libraries based on environment settings."
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/tools.logging "1.1.0"]
                 [environ "1.2.0"]]
  :main ^:skip-aot pluggable-functions.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
