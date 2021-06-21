package Objects;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Logger {

    java.util.logging.Logger logger = java.util.logging.Logger.getLogger("MyLog");

    User user;

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

    public void setUser(User user){
        this.user = user;
    }

    public java.util.logging.Logger getLogger() {
        return logger;
    }
}
