package naplozas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.plaf.IconUIResource;

public class logging {

    //public static final Logger LOGGER = LoggerFactory.getLogger(logging.class);

    public int countCharacters( String source) {
       // LOGGER.info("countCharacters: " + source);
        int counter = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == 'b') {
                //LOGGER.info("b: "+ i);
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new logging().countCharacters("abababac"));
    }

    /*
    SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Exception in thread "main" java.lang.NoClassDefFoundError: org/slf4j/impl/StaticLoggerBinder
	at org.slf4j.LoggerFactory.getSingleton(LoggerFactory.java:189)
	at org.slf4j.LoggerFactory.bind(LoggerFactory.java:112)
	at org.slf4j.LoggerFactory.performInitialization(LoggerFactory.java:105)
	at org.slf4j.LoggerFactory.getILoggerFactory(LoggerFactory.java:235)
	at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:208)
	at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:221)
	at naplozas.logging.<clinit>(logging.java:10)
Caused by: java.lang.ClassNotFoundException: org.slf4j.impl.StaticLoggerBinder
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:606)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:168)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
	... 7 more


     */
}
