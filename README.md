This project is intended to serve as a test harness to demonstrate the capabilities of Relational, Document and Graph 
data stores when tasked with aggregating related events from a source stream. Also an excuse to practice some clojure.

To run:  

./cljw -m hello.core

To test:  

./cljw -A:test

Consuming siblings (WIP)    
To consume siblings for the time being you will need to install:

`brew install clojure`

Bring up a local kafka cluster (single broker):

`docker-compose up -d`

You can then run the clojure consumer 

`clj -m siblings.shell`

and can use the command line producer script from https://kafka.apache.org/quickstart to send messages for consumption

`bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test`

