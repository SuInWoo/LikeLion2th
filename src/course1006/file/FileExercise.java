package course1006.file;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        File dir = new File("./");
        File files[] = dir.listFiles();

        for (File file: files) {
            System.out.println(file);
        }
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
