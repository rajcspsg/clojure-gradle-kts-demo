(ns math.calc-test
    (:require [clojure.test :refer :all]
       [math.calc :refer :all]))

(deftest add-test
         (println "adding numbers")
         (testing "adding two numbers basic test")
         (is (= 4 (add 1 3)))
         )