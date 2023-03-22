(defn factorial [n] (if (= n 0) 1 (* (bigint n) ( factorial (- n 1) ) ) ) )
(let [a 50] (println "factorial(" a ")=" (factorial a) ) )

