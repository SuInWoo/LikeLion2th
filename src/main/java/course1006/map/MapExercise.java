package course1006.map;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        MapName mapName = new MapName();
        HashMap<String, String> nameHashMaps = mapName.getNameMap();

        for (Map.Entry<String,String> entry: nameHashMaps.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
