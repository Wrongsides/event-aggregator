(ns people.core
  (:require [cheshire.core :as json]))

(defn name [names]
  (-> names
      (shuffle)
      (first)))

(defn generate-person [names]
  {:name (name names)
   :gender (rand-nth ["male","female"])
   :age (rand-int 100)})

(defn produce-message [names]
  (-> names
      (generate-person)
      (json/generate-string)))