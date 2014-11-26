(defproject exercises "0.1.0-SNAPSHOT"
  :description "Exercism exercises and solutions."
  :url "https://github.com/joshhill/exercism-solutions"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
