FROM openjdk:8-jre-slim

# Add the jar with all the dependencies
# Maven creates -0.0.1-SNAPSHOT.jar in the target folder of my workspace.
# We need this in some location - say - /Users/jar folder of the container I am using window so take the drive path
ADD  target/flaconi-0.0.1-SNAPSHOT.jar C:/Users/jar/flaconi-0.0.1-SNAPSHOT.jar

ADD testng.xml C:/Users/xml/testng.xml

# Command line to execute the test and path needs to be changed according to machine on which it will run
ENTRYPOINT ["java", "-cp", "C:/Users/jar/flaconi-0.0.1-SNAPSHOT.jar", "org.testng.TestNG", "C:/Users/xml/testng.xml"]
