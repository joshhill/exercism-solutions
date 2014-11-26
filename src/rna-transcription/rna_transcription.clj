(ns rna-transcription)

(defn- dna-to-rna [dna]
       (case dna
        \A \U
        \C \G
        \G \C
        \T \A
        (assert false)))

(defn to-rna [dna]
      (apply str (map dna-to-rna dna)))