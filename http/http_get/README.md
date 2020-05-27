# http-get

URL http/get headers and display them.

## Building

```bash
lein uberjar
```

## Usage

```bash
java -jar http-get-0.1.0-standalone.jar --url https://www.example.com
```

## Options

Listing of options this app accepts.

* -h,--help -> Help
* -u,--url URL -> URL to run http/get against

## Examples

```bash
java -jar http-get-0.1.0-standalone.jar --url https://www.google.com

-> HTTP/GET on: https://www.google.com

-> Available keys are: (:cached :request-time :repeatable? :protocol-version :streaming? :http-client :chunked? :cookies :reason-phrase :headers :orig-content-encoding :status :length :body :trace-redirects)

-> Response status code: 200

-> Headers are: {Server gws, Content-Type text/html; charset=ISO-8859-1, Alt-Svc h3-27=":443"; ma=2592000,h3-25=":443"; ma=2592000,h3-T050=":443"; ma=2592000,h3-Q050=":443"; ma=2592000,h3-Q049=":443"; ma=2592000,h3-Q048=":443"; ma=2592000,h3-Q046=":443"; ma=2592000,h3-Q043=":443"; ma=2592000,quic=":443"; ma=2592000; v="46,43", X-Frame-Options SAMEORIGIN, Connection close, Transfer-Encoding chunked, Expires -1, P3P CP="This is not a P3P policy! See g.co/p3phelp for more info.", Date Wed, 27 May 2020 01:29:09 GMT, X-XSS-Protection 0, Cache-Control private, max-age=0}
```

## License

Copyright © 2020 Bill Howe

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
<http://www.eclipse.org/legal/epl-2.0>.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at <https://www.gnu.org/software/classpath/license.html>.
