(defproject {{name}} "0.1.0-SNAPSHOT"
  :source-path "src/clj"
  :description "TODO: Project Description."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cascalog "1.8.4"]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [lein-multi "1.1.0-SNAPSHOT"]
                     [lein-midje "1.0.4"]      ;; for running midje tests
                     [midje-cascalog "0.3.0"]] ;; for testing: http://goo.gl/EXyEV
  ;; multi-deps allows you to test against multiple releases of
  ;; clojure. run "lein multi deps" and "lein multi midje" to run the
  ;; full test suite, or "lein multi midje --with 1.2" to target a
  ;; specific bundle.
  :multi-deps {"1.2" [[org.clojure/clojure "1.2.1"]
                      [cascalog "1.8.4"]]
               "1.4" [[org.clojure/clojure "1.4.0-alpha2"]
                      [cascalog "1.8.4"]]})