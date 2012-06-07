package demo.intellij.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggeklasse {

    public static final Logger logger = LoggerFactory.getLogger(Loggeklasse.class);

    public static void main(String... args) {
        logger.error("Pang");
        logger.warn("Pæng");
        logger.error("Pang", new Exception());
    }
}
