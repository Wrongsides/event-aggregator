(ns people.shell
  (:require [clojure.tools.logging :as log]
            [people.core :as core])
  (:import org.apache.kafka.common.serialization.StringSerializer
           org.apache.kafka.clients.producer.KafkaProducer
           org.apache.kafka.clients.producer.ProducerRecord))

(def producer-config {"bootstrap.servers", "localhost:9092"
                      "key.serializer" StringSerializer
                      "value.serializer" StringSerializer})

(def producer (KafkaProducer. producer-config))

(defn -main []
  (try
    (.send producer (ProducerRecord. "test" (core/generate-person)))
    (finally
      (.close producer))))