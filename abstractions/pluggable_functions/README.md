# pluggable_functions

Concept showing running functions from libraries based on environment settings.

## Installation

## Usage

- Run the default record map

  ```bash
  lein run
  ```

- Run the alternative record map functions

  ```bash
  export FUNCTION_LIB="alt"
  lein run
  ```

## Add Your Own Library

To add your own library that implements the protocol:

- Create a new file for the library. Example: "my-lib.clj"
- Require the protos library in order to implement it. Example:

  ```clojure
  (ns pluggable-functions.my-lib
    (:gen-class)
    (:require [pluggable-functions.protos :as protos]))
  ```

- Create the record that implements the protocol, defining how each function will behave. Example:

  ```clojure
  (defrecord process-my-lib [id]
    protos/process-things
    (process-stuff [this stuff] "Process stuff"
        (str "Implement your version here".))
    ;; the rest of the fucntions here..
  )
  ```

- Require your lib in the functions.clj file

  ```clojure
  (:require [pluggable-functions.my-lib])
  ```

- Add the entry to your library's record in the registry mapping.

  ```clojure
  :my-lib {:func #'pluggable-functions.my-lib/->process-my-lib
           :args nil}
  ```

- Export the environment var that maps to your function and run.

  ```bash
  export FUNCTION_LIB="my-lib"
  lein run
  ```

## Examples

```bash
> $ lein run

Aug 23, 2020 10:45:32 AM clojure.tools.logging$eval464$fn__467 invoke
INFO: Config is: {:function-lib :default}
Processing default stuff: 123 process stuff.
Processing default that: 123 process that.
Processing default another: 123 process another.

> $ export FUNCTION_LIB="alt"
> $ lein run

Aug 23, 2020 10:45:45 AM clojure.tools.logging$eval464$fn__467 invoke
INFO: Config is: {:function-lib alt}
Processing alt stuff: 123 process stuff.
Processing alt that: 123 process that.
Processing alt another: 123 process another.
```

---

## License

Copyright © 2020 Bill Howe

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
`http://www.eclipse.org/legal/epl-2.0`

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at `https://www.gnu.org/software/classpath/license.html`.
