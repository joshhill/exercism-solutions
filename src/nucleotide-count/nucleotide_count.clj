(ns nucleotide-count)

(def valid-dna #{\A \C \G \T \U})
(def nucleotides {\A 0 \C 0 \G 0 \T 0})

(defn- validate [dna]
  (if (contains? valid-dna dna) false (throw (Exception. "invalid nucleotide"))))

(defn nucleotide-counts [s]
  (select-keys (into nucleotides (frequencies s)) (keys nucleotides)))

(defn count [dna s]
  (or (validate dna) ((frequencies s) dna) 0))
