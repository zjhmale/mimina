(ns mimina.config-test
  (:require [clojure.test :refer :all]
            [mimina.config :refer :all]))

(deftest read-property-test
  (testing "get string property"
    (is (= "cleantha" (get-property (get-config "ttt") "ttt" "name")))
    (is (= "23" (get-property (get-config "ttt") "ttt" "age")))))
