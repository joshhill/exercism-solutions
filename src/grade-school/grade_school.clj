(ns grade-school)

(defn add [db name grade]
  (merge-with concat db (hash-map grade [name])))

(defn grade [db grade]
  (db grade []))

(defn sorted [db]
  (into (sorted-map) (for [[k v] db] [k (sort v)])))