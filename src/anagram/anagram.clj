(ns anagram
  (:require [clojure.string :refer [lower-case]]))

(defn- anagram? [x y]
  (let [lx (lower-case x)
        ly (lower-case y)]
    (and (not= lx ly)
         (= (sort lx) (sort ly)))))

(defn anagrams-for [word coll]
  (filter #(anagram? word %) coll))