package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerHandler {
    static FileInputStream file;
    static Properties prop;
    static {
        try {
            String propertiesPath = System.getProperty("user.dir") + "/config/browser.properties";
            file = new FileInputStream(propertiesPath);
            prop = new Properties();
            prop.load(file);
            File logDir = new File(prop.getProperty("folder"));
            if (!logDir.exists()) {
                logDir.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static final Logger log = LogManager.getLogger(LoggerHandler.class);

    public static void trace(String msg) {
        log.trace(msg);
    }

    public static void debug(String msg) {
        log.debug(msg);
    }

    public static void info(String msg) {
        log.info(msg);
    }

    public static void warn(String msg) {
        log.warn(msg);
    }

    public static void error(String msg) {
        log.error(msg);
    }

    public static void fatal(String msg) {
        log.fatal(msg);
    }
}
