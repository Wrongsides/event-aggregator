(ns hello.core-test
    (:require [clojure.test :refer :all]
              [hello.core :refer :all]))

(deftest core-tests
  (testing "it returns hello world"
    (is (= (with-out-str (-main)) "Hello world!\n"))))