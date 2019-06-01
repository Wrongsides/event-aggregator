This project is intended to serve as a test harness to demonstrate the capabilities of Relational, Document and Graph 
data stores when tasked with aggregating related events from a source stream. Also an excuse to practice some clojure.


To consume people and produce siblings for the time being you will need to install:

`brew install clojure docker-compose`

Bring up a local kafka cluster (single broker):

`docker-compose up -d`

You can then run the sibling component to start consuming people 

`clj -m siblings.shell`

and can use the people component to produce a person

`clj -m people.shell`

For development you can use this command to start an nREPL to connect with vs code & calva

`clj -Sdeps '{:deps {nrepl {:mvn/version "0.6.0"}}}' -m nrepl.cmdline --interactive`

You can use this to evaluate code and run tests, or run all unit tests with `clj -A:test`