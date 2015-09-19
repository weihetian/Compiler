############################
#
#	Sanhu Li's Makefile for PA1 testing
#
############################

JAVA = java 
JAVAC = javac 

JAR = $(JAVA) -jar 
JARS_H = MJ_PA
JARS_T = .jar 
JAVA_H = PA
JAVA_C = Test 
JAVA_T = .java 

test:
	java -jar MJ_PA2.jar PA2Test1.java
	java -jar MJ_PA3.jar PA3Test1.java
	java -jar MJ_PA3.jar PA3Test2.java
	java -jar MJ_PA3.jar PA3Test3.java
	java -jar MJ_PA4.jar PA4Test1.java
	java -jar MJ_PA4.jar PA4Test2.java
	java -jar MJ_PA4.jar PA4Test3.java
	java -jar MJ_PA5.jar PA5Test1.java
	java -jar MJ_PA5.jar PA5Test2.java
	java -jar MJ_PA5.jar PA5Test3.java
	java -jar MJ_PA6.jar PA6Test1.java
	java -jar MJ_PA6.jar PA6Test2.java
	java -jar MJ_PA6.jar PA6Test3.java


clean:
	rm *.dot *.class