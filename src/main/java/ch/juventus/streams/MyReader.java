package ch.juventus.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyReader {

    public void readFromTextFile(String filePath) throws IOException {
        Reader reader = new BufferedReader(new FileReader(filePath));

        int data = reader.read();
        while(data != -1){
            char dataChar = (char) data;
            System.out.print(dataChar);
            data = reader.read();
        }

        reader.close();
    }

}
