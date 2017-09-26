package sorting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogging implements Logging {

    private File toWrite;

    public  FileLogging(final  File toWrite){
        this.toWrite=toWrite;
    }

    @Override
    public void write(String name){

        try {
            FileWriter fileWriter = new FileWriter(toWrite);
            fileWriter.write(name);
            fileWriter.close();
        }catch(IOException e){


        }

    }

}
