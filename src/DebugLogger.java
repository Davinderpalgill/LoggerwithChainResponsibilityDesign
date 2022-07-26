public class DebugLogger extends LoggerInterceptor {
    DebugLogger(LoggerInterceptor loggerInterceptor){
        super(loggerInterceptor);
    }
    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println(logLevel+" "+message);
        }
        else super.log(logLevel,message);
    }
}
