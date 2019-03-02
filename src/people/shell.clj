(ns people.shell
  (:require [people.core :as core]))

(defn -main []
  (println "The people component shell will stream people.")
  (core/purpose))