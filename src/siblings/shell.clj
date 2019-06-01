(ns siblings.shell
  (:require [clojure.tools.logging :as log]
            [siblings.core :as core])
  (:import org.apache.kafka.common.serialization.StringDeserializer
           org.apache.kafka.clients.consumer.KafkaConsumer))

(def consumer-config
  {"bootstrap.servers", "localhost:9092"
   "group.id",          "siblings-group"
   "key.deserializer",  StringDeserializer
   "value.deserializer", StringDeserializer
   "auto.offset.reset", "earliest"
   "enable.auto.commit", "false"})

(def consumer (doto (KafkaConsumer. consumer-config)
                (.subscribe ["people"])))

(defn -main []
  (while true
    (let [records (.poll consumer 100)]
      (doseq [record records]
        (log/info "Recieved message: " (.value record)))
      (.commitAsync consumer))))