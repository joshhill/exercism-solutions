(ns bob
    (:require [clojure.string :refer [blank?]]))

(defn shout? [phrase]
      (and
        (re-find #"[A-Z]+" phrase)
        (= (.toUpperCase phrase) phrase)))

(defn question? [phrase]
      (re-find #"\?$" phrase))

(defn response-for [phrase]
      (cond
        (blank? phrase) "Fine. Be that way!"
        (shout? phrase) "Whoa, chill out!"
        (question? phrase) "Sure."
        :else "Whatever."))
