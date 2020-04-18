# config-test

Basic example of using an EDN (extensible data notation) file for configuration.

## Usage

Populate a person.edn file at: $HOME/person.edn

Example contents:

```bash
{
  :myname "Bob"
  :myage 11
  :myjob "Being a cat"
}
```

Run the project core source file.

```bash
lein run
```

...
