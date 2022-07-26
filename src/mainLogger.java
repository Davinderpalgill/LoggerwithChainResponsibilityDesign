public class mainLogger {
    public static void main(String[] args) {
     LoggerInterceptor obj = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
     obj.log(LoggerInterceptor.DEBUG,"i am a debugger");
     obj.log(LoggerInterceptor.ERROR,"i am a error");
     obj.log(LoggerInterceptor.INFO,"i am info");
    }
}
