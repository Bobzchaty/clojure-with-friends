
[1 2 3 4 5 nil false "asdf"]

;; var fun1 = function (a, b, c) { .. }

(defn fun1 [a b c]
  (println "a: " a)
  (println "b: " b)
  b)

(fun1 "pierwsza" "sdfvvvv" "asd")

(defn fun2 [x y z c]
  [c z y x])

(fun2 9 8 7 6)

(concat [1 2] [4 8] [4 5] [6 8 8 5 4 45] [] [] [] [] [0])

(defn reverse-concat [v1 v2 v3]
  (concat v3 v2 [v1]))

(reverse-concat [4 5 6]
                [7 8 9]
                [9 10])

(conj [3 4 5] 99 100)

(concat [3 4 5] [99 100])


;; =
;; var a = 1; NIE

(= nil nil)

(def v1 (conj [3 4 5] 99 101))

(= v1
   (concat [3 4 5] [99 101]))

(defn fun2 [x y z c]
  [c z y x])

(def fun2 (fn [x y z c]
  [c z y x]))

[4 5 -6] ;;

(defn do-trzeciej [n]
  (* n n n))

(map do-trzeciej
     [3 2 1 0 -1 -2])

(map inc
     [3 2 1 0 -1 -2])

(map (fn [a b] (+ a b))
     [100 200 300]
     [1000 2000 3000])

(map +
     [101 202 303]
     [1000 2000 3000])

(map +
     [101  202  304  90 7]
     [50   50   50   90 7]
     [1000 2000 3000 90 5 8 9])




















