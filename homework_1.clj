;; Dokumentacja: http://conj.io/

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; 0. Potęgowanie. 2^3 liczymy w Clojure następująco:

(Math/pow 2 3)

;; Sprawdź co się stanie jeśli zamiast 2 i 3 podstawisz inne wartości - zera, nie liczby, uruchomisz tą funkcję z inną liczbą argumentów niż 2.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; 1. Uzupełnij poniższą funkcję. Zakładamy że numbers i powers to kolekcje liczb.
;; Opis działania poniżej.
;; Zalecam użycie funkcji map: http://conj.io/store/v1/org.clojure/clojure/1.7.0/clj/clojure.core/map/

(defn map-power [numbers powers]
  ;; TODO
  )

;; Pokażę na przykładzie co ma robić:
(map-power [[1 2 3] [2 1 0]])
;; ma zwrócić [1 2 1]
;; czyli kolejne wartości wyglądają następująco:
;; - pierwszy element z numbers podniesiony do potęgi z pierwszego elementu z powers
;; - drugi element z numbers podniesiony do potęgi z drugiego elementu z powers
;; itp.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; 2. Uzupełnij poniższą funkcję. Zakładamy, że coll to kolekcja liczb a min-value to jakaś liczba.
;; Funkcja ma usunąć wszytkie liczby z coll mniejsze niż min-value.
;; Zalecam użycie funkcji filter (jest podobna do map) - http://conj.io/store/v1/org.clojure/clojure/1.7.0/clj/clojure.core/filter/

(defn filter-greater-than [min-value coll]
  ;; TODO
)

;; przykłady:

(filter-greater-than 2.1 [1 2.5 3 -4.5])
;; powyższe wywołanie ma zwrócić [2.5 3]

(filter-greater-than 999 [1 2.5 3 -4.5])
;; powyższe wywołanie ma zwrócić []





