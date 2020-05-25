(ns template
  (:require [clojure.tools.cli])
  (:gen-class))

(def cli_options
  "CLI arguments (clojure.tools.cli)"
  [;[short-option long-option description :other options]
   ["-h" "--help" "Show help" :default false]
   ["-v" "--verbose" "Verbose output" :default false]
   ["-n" "--name NAME" "Name to greet" :default "Bobby Tables"]])

(defn show_usage
  "Show the application usage."
  [cli_args]
  (println "--App Usage--")
  (println (:summary cli_args)))

(defn say_hello
  "FIXME - An important function."
  [name]
  (println "Hello" name "!"))

(defn -main
  "FIXME - main description here"
  [& args]
  ; parse command line args
  (let [cli_args (clojure.tools.cli/parse-opts args cli_options)
        the_name (get-in cli_args [:options :name])]
    ; show usage when help flag set and exit
    (when (get-in cli_args [:options :help])
      (show_usage cli_args)
      (System/exit 0))

    ; verbose mode output
    (when (get-in cli_args [:options :verbose])
      (println "-> Calling say_hello"))

    (say_hello the_name)))
