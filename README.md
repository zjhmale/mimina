# mimina

a clojure wrapper for typesafe config lib to get property in config files

[![Clojars Project](http://clojars.org/mimina/latest-version.svg)](http://clojars.org/mimina)

## Usage

* put you config file in classpath such as `resources` in a leiningen or maven project

* get config

```clj
(get-config config-file-name)
```

* get property

```clj
(get-property config)
```

## License

Copyright © 2015 jihui

Distributed under the Eclipse Public License, the same as Clojure.
