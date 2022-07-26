import java.util.Optional;

import static java.util.Optional.*;

public abstract class LoggerInterceptor {
    public static final int INFO = 1;
    public static final int DEBUG =  2;
    public static final int ERROR =3;

    LoggerInterceptor nextloggerInterceptor;

    LoggerInterceptor(LoggerInterceptor nextLogger){
       this.nextloggerInterceptor = nextLogger;
    }
    public void log(int loglevel, String message){
       // Optional<LoggerInterceptor> obj = ofNullable(nextloggerInterceptor.log(loglevel, message));
if(nextloggerInterceptor!=null){
    nextloggerInterceptor.log(loglevel,message);
}

    }

}
