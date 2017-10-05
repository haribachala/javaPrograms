package sorting;

import org.omg.PortableInterceptor.INACTIVE;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(INSTANCE==null){
            return  new Singleton();
        }else
            return INSTANCE;
    }
}
