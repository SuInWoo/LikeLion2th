package course1006.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file: files) {
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader("./a_file.txt");

        return (char)fileReader.read();
    }

    public String read2Char(String filename) throws IOException{
        FileReader fileReader = new FileReader("./a_file.txt");
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();

        return str;
    }
    public static void main(String[] args) throws IOException {

        FileExercise fileExercise = new FileExercise();
        String addr = "./a_file.txt";

        System.out.println(fileExercise.readAChar(addr));
        System.out.println(fileExercise.read2Char(addr));

    }

    /**
     * ./out
     * ./README.md
     * ./.gitignore
     * ./LikeLion2th.iml
     * ./.git
     * ./a_file.txt
     * ./.idea
     * ./src
     */
}
