# clojure-snippets

Clojure example snippets.

Single files that showcase syntax and/or a concept.

----

## Descriptions

Snippets

* collections -> Collection data types (lists, maps, sets, vectors)
* file_operations -> Interacting with files and EDN for configuration.
* flow_control -> Flow control concepts (case, cond, iters, for, if, when, recursion)
* functions -> Using functions (and anonymous/lambda) in clojure
* http -> Http/get examples
* misc -> Miscellanious items (date)
* power_tools -> Some powerful Clojure built in core functions (apply, comp, filter, loop, map, partial, reduce)
* syntax -> Basic syntax (hello world, math operators, comparison operators, variables)

Templates

* template -> Template for a Clojure CLI/deps project with cli args. (run 'clj -m template -h' from that dir) Does not need boot or lein.
* template.boot -> Template for a single file Clojure script via boot with cli args

----

## Install Clojure

* Pre-Req: Install openjdk and verify

  ```bash
  sudo apt install openjdk-8-jdk
  java -version
  ```

* Download clojure installer

  ```bash
  curl -O https://download.clojure.org/install/linux-install-1.10.1.478.sh
  ```

* Make executable and run

  ```bash
  chmod +x linux-install-1.10.1.478.sh
  sudo ./linux-install-1.10.1.478.sh
  ```

* Run the Clojure REPL and print hello (ctrl+d to quit)

  ```bash
  clj

  user=> (println "Hello!")
  ```

----

## Clojure CLI/deps Projects

Clojure CLI tools (with deps.edn) allow for a built in way to create projects.

Official CLI/deps guide: `https://clojure.org/guides/deps_and_cli`

The basics:

* Create a project directory structure

  ```bash
  mkdir -p my_project/src/my_project
  cd my_project
  ```

* Create a deps.edn file (manages project information).

  Example deps.edn contents

  * paths -> Directory paths to be included in the classpath
  * deps -> Dependent packages.

  ```clojure
  {:paths ["src" "classes"]
   :deps {org.clojure/tools.cli {:mvn/version "0.4.2"}}}
  ```

* Create the project's main file.

  ```bash
  vim src/my_project/core.clj
  ```

  Example Contents

  ```clojure
  (ns my-project.core
   (:gen-class))

  (defn -main [& args]
   (println "Hello Clojure World"))
  ```

* Run the app's '-main' function by referencing the namespace.

  ```bash
  clj -m my-project.core
  ```

----

## Leiningen Projects

Leiningen is another method for managing Clojure projects. It is similar to pipenv in the Python world, in that it manages project space and dependent packages.

Offical Site: `https://leiningen.org/`

### Install Leiningen

* Download the installer

  ```bash
  wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
  ```

* Put the installer in a location in your PATH and make executable

  ```bash
  mv lein ~/bin/
  chmod +x ~/bin/lein
  ```

* Run lein. It will auto setup everything you need.

  ```bash
  ./lein
  ```

### Using Leiningen

Full tutorial/more details: `https://github.com/technomancy/leiningen/blob/stable/doc/TUTORIAL.md`

* View available lein commands

  ```bash
  lein help
  ```

* Create a new app project (replace "hello_world" with your project name)

  ```bash
  lein new app hello_world

  # change into the new project directory for the rest of the commands
  cd hello_world
  ```

* Run the "-main" part of your app

  ```bash
  lein run
  ```

* Run the project's unit tests

  ```bash
  lein test
  ```

* Run the interactive REPL (read eval print loop)

  ```bash
  lein repl
  ```

* Create a standalone executable jar file of your entire project

  ```bash
  # create the standalone jar
  lein uberjar

  # run the standalone jar
  java -jar target/uberjar/hello_world-0.1.0-SNAPSHOT-standalone.jar
  ```

### Leiningen Plugins

Lein can be extended via plugins.

Some useful plugins are:

* lein-exec -> Allows single clojure files to be executed and their requirements resolved.
* lein-zprint -> Pretty format a clojure source file

Plugins can be added to the 'plugins' vector of:

* ~/.lein/profiles.clj -> cross project profiles for plugins
* A lein project's project.clj -> project specific plugins

profiles.clj example:

```clojure
{:user {:plugins [[lein-localrepo "0.5.4"]
                  [lein-exec "0.3.7"]
                  [lein-zprint "0.5.3"]]}}
```

project.clj example:

```clojure
(defproject myproject "0.1.0"
;; description, url, license, dependencies, profiles, etc
:plugins [[lein-zprint "0.5.3"]])
```

----

## Boot Projects

Boot is an alternative project management/build tool to Leiningen. It can also be used for single file Clojure scripts if you don't want to create a full project.

Official site: `https://boot-clj.com/`

### Install Boot

* Download the boot binary

  ```bash
  wget https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh
  ```

* Move to a directory in your PATH and make executable

  ```bash
  mv boot.sh ~/bin/boot
  chmod +x ~/bin/boot
  ```

* Initial execution in order to download requirements (boot -h > help)

  ```bash
  boot -h
  ```

### Using Boot

Full tutorial/more details: `https://github.com/boot-clj/boot`

* Available boot commands/help

  ```bash
  boot -h
  ```

* Open the boot REPL

  ```bash
  boot repl
  ```

#### Use boot for single file scripts

```clojure
#!/usr/bin/env boot

; boot environment settings - downloads dependencies automatically
(set-env! :dependencies '[[clj-http "3.10.0"]])

; boot clojar requirement
(require '[clj-http.client :as http])

;; ...the rest of the script
```

* The shebang env boot line (first line), uses the boot binary
* The set-env line will auto download required dependencies from remote sources such as `https://clojars.org/`
* The require section to use any libraries
