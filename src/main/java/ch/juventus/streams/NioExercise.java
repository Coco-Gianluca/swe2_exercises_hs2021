package ch.juventus.streams;

import java.io.IOException;
import java.nio.file.*;

public class NioExercise {

    public static void main(String[] args) throws IOException {
        createDirectory();
        createTextFile();
        writeIntoFile();
        renameTextFile();
        readFromFile();
        listContent();
        deleteAll();
    }

    private static void createDirectory() throws IOException {
        Path dir = Paths.get("src/main/resources/newDir");
        Files.createDirectory(dir);
        if(Files.exists(dir)) {
            System.out.println("New directory created '" + dir + "'");
        }
    }

    private static void createTextFile() throws IOException {
        Path file = Paths.get("src/main/resources/newDir/newFile.txt");
        Files.createFile(file);
        if(Files.exists(file)) {
            System.out.println("New file created '" + file + "'");
        }
    }

    private static void writeIntoFile() throws IOException {
        Path file = Paths.get("src/main/resources/newDir/newFile.txt");
        Files.writeString(file, "hello world");
        Files.writeString(file, "--append this text--", StandardOpenOption.APPEND);
//        Files.writeString(file, "overwritten");
        System.out.println("Write content to file '" + file.getFileName() + "'");
    }

    private static void renameTextFile() throws IOException {
        Path file = Paths.get("src/main/resources/newDir/newFile.txt");
        Path renamed = Paths.get("src/main/resources/newDir/renamedFile.txt");
        Files.move(file, renamed);
        if(Files.exists(renamed)) {
            System.out.println("Renamed file '" + file + "' to '" + renamed + "'");
        }
    }

    private static void readFromFile() throws IOException {
        Path renamed = Paths.get("src/main/resources/newDir/renamedFile.txt");
        String content = Files.readString(renamed);
        System.out.println("Read content from file " + renamed.getFileName() + ": " + content);
    }

    private static void listContent() throws IOException {
        Path dir = Paths.get("src/main/resources/newDir");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir);
        System.out.println("Directory content " + dir + ":");
        for (Path path : directoryStream) {
            System.out.println(path.toString());
        }
    }

    private static void deleteAll() throws IOException {
        Path dir = Paths.get("src/main/resources/newDir");
        deleteDir(dir);
        System.out.println("Directory " + dir + " deleted");
    }

    private static void deleteDir(Path dir) throws IOException {
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir);
        for (Path path : directoryStream) {
            if(Files.isDirectory(path)) {
                deleteDir(path);
            } else {
                Files.delete(path);
            }
        }
        Files.delete(dir);
    }

}
