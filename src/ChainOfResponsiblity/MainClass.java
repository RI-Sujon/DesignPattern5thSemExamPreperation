package ChainOfResponsiblity;

public class MainClass {
    public static void main(String[] args) {
        AbstractLogger logger = createChain() ;

        logger.logMessage(AbstractLogger.ERROR, "Information");
    }

    public static AbstractLogger createChain(){
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO) ;
        AbstractLogger fileLogger = new ConsoleLogger(AbstractLogger.DEBUG) ;
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR) ;

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger); ;

        return errorLogger ;
    }
}
