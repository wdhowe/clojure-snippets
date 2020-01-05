#!/usr/bin/env boot
; Title:
; Description:
; Author:

; boot env settings (download 3rd party libraries)
;(set-env! :dependencies '[[library-name "1.0.0"]])

; boot requires (use libraries)
(require '[boot.cli :as cli])

(defn say_hello
  "FIXME - important function"
  [name]
  (println "Hello" name "!")
)

(cli/defclifn -main
  "FIXME - script main description here"
  ; short-option long-option parameter(optional) type description
  ; Note: -h (help) is built into the boot cli arg parser
  [n name NAME str "to say hello to."
   v verbose bool "Enable verbose output. (default: false)"]

  (when verbose
    (println "-> Checking for name arg...")
  )
  (when (nil? name)
    (println "Name argument not provided. Exiting.")
    (System/exit 1)
  )

  (when verbose
    (println "-> Calling say_hello")
  )
  (say_hello name)
)
