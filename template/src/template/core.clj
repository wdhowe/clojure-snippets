(ns template.core
  (:require [clojure.tools.cli])
  (:gen-class))

(def cli-options
  "CLI arguments (clojure.tools.cli)"
  [;[short-option long-option description :other options]
   ["-h" "--help" "Show help" :default false]
   ["-v" "--verbose" "Verbose output" :default false]
   ["-n" "--name NAME" "Name to greet" :default "Bobby Tables"]])

(defn show-usage
  "Show the application usage."
  [args]
  (println "--App Usage--")
  (println (:summary args)))

(defn verbose?
  "Determine if args contain verbose."
  [args]
  (get-in args [:options :verbose]))

(defn say-hello
  "FIXME - An important function."
  [name]
  (println "Hello" name "!"))

(defn -main
  "FIXME - main description here"
  [& args]
  ; parse command line args
  (let [cli-args (clojure.tools.cli/parse-opts args cli-options)
        the-name (get-in cli-args [:options :name])]
    ; show usage when help flag set and exit
    (when (get-in cli-args [:options :help])
      (show-usage cli-args)
      (System/exit 0))

    ; verbose mode output
    (when (verbose? cli-args)
      (println "-> Calling say-hello"))

    (say-hello the-name)))
