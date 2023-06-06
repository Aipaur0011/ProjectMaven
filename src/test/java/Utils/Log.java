package Utils;

import java.util.logging.Logger;

public class Log {

    public  static Logger log= Logger.getLogger(Log.class.getName());

    // When the test starts, I should print the logs
    // When my tests stops, I should print the log
    // If I want to print any message in between, I should print the logs
}
