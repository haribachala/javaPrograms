package sorting;

public class ConsoleLogging implements Logging {

    @Override
    public void write(String name){
        System.out.println("Console logging");
    }
}
