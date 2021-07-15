package Objects;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Logger {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("MyLog");

    private static Logger instance = null;

    private Logger() {
    }

    public void setLogger(User user){
        FileHandler fileHandler;
        try{
            fileHandler = new FileHandler(user.getName()+"\\LOGGER.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (SecurityException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public java.util.logging.Logger getLogger() {
        return logger;
    }

    public static Logger getInstance(){
        if (instance == null)
            instance = new Logger();
        return instance;
    }
}
