(ns siblings.core-test
  (:require [clojure.test :refer :all]
            [siblings.core :refer :all]))

(deftest test-person->siblings
  (testing "Should return a map of person and siblings"
    (let [person "person"
          expected {:person "person"
                    :siblings []}]
    (is (= expected (person->siblings person))))))