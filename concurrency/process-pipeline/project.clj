(defproject process-pipeline "0.1.0-SNAPSHOT"
  :description "core.async process pipeline example for data transformations."
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/core.async "1.2.603"]]
  :main ^:skip-aot process-pipeline.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
