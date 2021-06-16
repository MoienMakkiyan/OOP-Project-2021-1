package Objects;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Logger {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("MyLog");;

    public Logger() {

        setLogger();
    }

    private void setLogger(){
        FileHandler fileHandler;
        try{
            fileHandler = new FileHandler("Logfile.log");
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
}
