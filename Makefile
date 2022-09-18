test.txt: counter/FromOneTo.class fizzbuzz/FizzBuzzer.class
	  java -classpath counter FromOneTo 10 \
	| java -classpath fizzbuzz FizzBuzzer \
	| tee test.txt
counter/FromOneTo.class: counter/FromOneTo.java
	javac counter/FromOneTo.java
fizzbuzz/FizzBuzzer.class: fizzbuzz/FizzBuzzer.java
	javac fizzbuzz/FizzBuzzer.java
