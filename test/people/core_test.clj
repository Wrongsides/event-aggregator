(ns people.core-test
  (:require [cheshire.core :as json]
            [clojure.test :refer :all]
            [people.core :refer :all]))

(deftest test-name
  (testing "Should shuffle names and return first value"
    (let [names ["one","two"]
          name (name names)]
      (is (or (= "two" name) (= "one" name))))))

(deftest test-generate-person
  (testing "Should return person with name, age and gender"
    (let [person (generate-person ["John"])]
      (is (= "John" (:name person)))
      (is (= [:name :gender :age] (keys person))))))

(deftest test-produce-message
  (testing "Should generate a person as json string"
    (is (json/parse-string (produce-message ["John"])))))