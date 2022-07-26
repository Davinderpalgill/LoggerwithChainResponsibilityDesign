public class ErrorLogger extends LoggerInterceptor {
    ErrorLogger(LoggerInterceptor loggerInterceptor){
        super(loggerInterceptor);

    }
    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println(logLevel+" "+message);
        }
        else super.log(logLevel,message);
    }

}
