This project is intended to serve as a test harness to demonstrate the capabilities of Relational, Document and Graph 
data stores when tasked with aggregating related events from a source stream. Also an excuse to practice some clojure.

To run:  

./cljw -m hello.core

To test:  

./cljw -A:test

Consuming siblings (WIP)    
To consume siblings for the time being you will need to install:

`brew install clojure`

Follow the Kafka quickstart guide for version 2.1.0 creating a topic called "test"

https://kafka.apache.org/quickstart

And use the command line producer script to send messages for consumption

`bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test`

You can then run the clojure consumer 

`clj -m siblings.shell`