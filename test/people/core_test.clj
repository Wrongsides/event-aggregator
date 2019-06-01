(ns people.core-test
  (:require [clojure.test :refer :all]
            [people.core :refer :all]))

(deftest test-generate-person
  (testing "Should return a string person"
    (is (= (generate-person) "person"))))