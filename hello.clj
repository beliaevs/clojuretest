(println "hello!") ; say hello
; check recursion depth
(defn f [n] 
  (if (= 0 n) 
    0 
    (+ n (f (- n 1) ) ) ) )

(let [a 1000] 
  (println (f a) ) ) ;no tail recursion

(defn loopf [n] 
  (loop [cnt n 
         acc 0]
    (if (= cnt 0) 
      acc 
      (recur (- cnt 1) (+ acc cnt) ) ) ) )

(let [a 10000] 
  (println (loopf a) ) ) ;special loop