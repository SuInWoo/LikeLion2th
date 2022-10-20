package course1007.fileparse;

import course1007.fileparse.DoSomething;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {

    DoSomething<T> doSomething;

    public List<T> readByLine(String fileName) throws IOException {

        List<T> result = new ArrayList<>();

        //삽
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String str;

        while ((str = reader.readLine()) != null) {
            System.out.println(str);
//            PopulationMove pm = parse(str);
        }
        return result;
    }
}
