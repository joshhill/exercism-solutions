(ns word-count
    (:require [clojure.string :refer [lower-case]]))

(defn word-count [phrase]
      (frequencies (re-seq #"[a-z0-9]+" (lower-case phrase))))
