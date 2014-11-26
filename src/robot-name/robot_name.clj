(ns robot-name)

(def char-set {:alpha "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
               :numeric "0123456789"})

(defn- rand-name []
  (str (rand-nth (:alpha char-set))
       (rand-nth (:alpha char-set))
       (rand-nth (:numeric char-set))
       (rand-nth (:numeric char-set))
       (rand-nth (:numeric char-set))))

(defn robot [] (atom (rand-name)))

(defn robot-name [robot] (@robot))

(defn reset-name [robot] (reset! robot (rand-name)))
