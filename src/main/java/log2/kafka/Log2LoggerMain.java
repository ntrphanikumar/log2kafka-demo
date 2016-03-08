package log2.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log2LoggerMain {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Log2LoggerMain.class);
    
    public static void main(String[] args) {
        LOGGER.info("Astala vista - Info");
        LOGGER.error("Astala vista - Error");
        LOGGER.warn("Astala vista - Warn");
    }
}
