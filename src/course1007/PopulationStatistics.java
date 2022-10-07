package course1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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
        return new PopulationMove(parseArr[0], parseArr[1]);    //전입 to, 전출 from
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            for (String str : strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";

    }

    public Map<String, Integer> getMoveCnt(List<PopulationMove> pml){
        //11,26 이런형식으로 String에 삽입
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm:pml){
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key,1);
            }else {
                moveCntMap.put(key, moveCntMap.get(key)+1);
            }
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException {

//        String address = "/Users/suin/Downloads/수업 데이터 파일/2021_인구관련연간자료_20221006_12557.csv";
        String address = "./from_to.txt";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(address);

        Map<String, Integer> map = ps.getMoveCnt(pml);
        String targetFileName = "each_sido_cnt.txt";
        ps.createAFile(targetFileName);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String s = String.format("key:%s value:%d \n", key, map.get(key));
            cntResult.add(s);
        }
        ps.write(cntResult,targetFileName);








//        Set<Integer> sidoCodes = new HashSet<>();

//        List<String> strings = new ArrayList<>();
//        for (PopulationMove pm : pml){
//            System.out.printf("전입:%s, 전출:%s \n", pm.getFromSido(), pm.getToSido());
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);

//            sidoCodes.add(pm.getFromSido());
//            sidoCodes.add(pm.getToSido());
//        }
//        System.out.println(sidoCodes);

//        System.out.println(pml.size());

//        populationStatistics.createAFile("./from_to.txt");
//        populationStatistics.write(strings, "./from_to.txt");

    }
}
