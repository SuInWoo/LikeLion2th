package course1007.fileparse;

import course1007.PopulationMove;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>();
        List<PopulationMove> result = readLineContext.readByLine("/Users/suin/Downloads/수업 데이터 파일/2021_인구관련연간자료_20221006_12557.csv");
    }
}
