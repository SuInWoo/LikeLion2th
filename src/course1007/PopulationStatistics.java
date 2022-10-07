package course1007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
    파일 읽어오기
 */
public class PopulationStatistics {
    public void readByChar(String fileName) throws IOException {

        // 1byte 씩 읽기
        FileReader fileReader = new FileReader(fileName);
        String fileContents ="";

        while (fileContents.length() < 50){
            char c = (char)fileReader.read();
            fileContents += c;
        }

        System.out.println(fileContents);

    }

    //요즘 스타일
    public void readByLine2(String fileName) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //////////////////////////////////////////////////////////////////

    public List<PopulationMove> readByLine(String fileName) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );
        String str;

        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }

        reader.close();
        return pml;
    }

    public PopulationMove parse(String data){
        String[] parseArr = data.split(",");
        return new PopulationMove(parseArr[0], parseArr[6]);    //전입 to, 전출 from
    }


    public static void main(String[] args) throws IOException {

        String address = "/Users/suin/Downloads/수업 데이터 파일/2021_인구관련연간자료_20221006_12557.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readByLine(address);

        System.out.println(pml.size());

    }
}
