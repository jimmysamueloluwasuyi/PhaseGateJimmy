



import org.junit.jupiter.api.Test;



import static
org.junit.jupiter.api.Assertions.assertEquals;



compile
javac-cp "junit-platform-consolestandalone-1.11.0.jar:out"-d out TestFile.java CodeFile.java


run code

java-cp "junit-platform-console-standalone-1.11.0.jar:out"org.junit.platform.console.Console Launcher--scan-class-path
