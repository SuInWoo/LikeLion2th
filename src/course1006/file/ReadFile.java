package course1006.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    char readOneByte(String filename) throws IOException {

        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)){
            return (char)br.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("");
        char c = readFile.readOneByte("./a_file.txt");

        System.out.println(c);

    }

}
