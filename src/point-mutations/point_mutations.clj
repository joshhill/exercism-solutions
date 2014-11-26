(ns point-mutations)

(defn hamming-distance [x y]
  (if (= (count x) (count y))
    (apply + (map #(if (= % %2) 0 1) x y))
    nil))
