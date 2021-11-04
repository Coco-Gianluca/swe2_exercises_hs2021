package ch.juventus.streams;

import java.io.*;

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

    public void readAtPosition(String filePath, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");

        file.seek(position);

        int data = file.read();
        while(data != -1){
            char dataChar = (char) data;
            System.out.print(dataChar);
            data = file.read();
        }

        file.close();
    }

}
