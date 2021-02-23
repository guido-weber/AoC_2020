(ns aoc-2020.day01.core)

(defn inp []
  (->> (slurp "src/aoc_2020/day01/input.txt")
       clojure.string/split-lines
       (map #(Integer/parseInt %))))

(defn part1 []
  ; Find the two entries that sum to 2020;
  ; what do you get if you multiply them together?
  (let
   [entries (inp)
    found (filter (fn [e] (some #(= (- 2020 %) e) entries)) entries)]
    (println (* (first found) (second found)))))

(defn -main []
  (part1))
