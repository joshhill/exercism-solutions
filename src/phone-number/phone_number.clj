(ns phone-number
  (:require [clojure.string :as str]))

(defn number [s]
  (let [s (str/replace s #"[^\d]+" "")
        length (count s)]
    (cond
      (and (= length 11) (= \1 (first s))) (subs s 1)
      (or (< length 10) (> length 10)) "0000000000"
      :else s)))

(defn area-code [s]
  (subs s 0 3))

(defn pretty-print [s]
  (let [s (number s)]
    (format "(%s) %s-%s" (subs s 0 3) (subs s 3 6) (subs s 6))))
