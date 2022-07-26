public class InfoLogger extends LoggerInterceptor {
    InfoLogger(LoggerInterceptor loggerInterceptor){
        super(loggerInterceptor);
    }
    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println(logLevel+" "+message);
        }
        else super.log(logLevel,message);
    }
}
