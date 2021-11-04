package ch.juventus.streams;

import java.io.*;

public class MyWriter {

    public void writeToTextFile(String filePath) throws IOException {
        Writer writer = new BufferedWriter(new FileWriter(filePath));

        StringBuffer outputText = new StringBuffer();
        outputText.append("Hello World!");
        outputText.append(System.lineSeparator());
        outputText.append("I am writing to an output file");

        writer.write(outputText.toString());

        writer.close();
    }

    public void writeAtPosition(String filePath, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");

        file.seek(position);
        file.write("-huhu-".getBytes());

        file.close();
    }

}
