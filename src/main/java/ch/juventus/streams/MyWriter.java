package ch.juventus.streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

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

}
