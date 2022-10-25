package course1025.algorism1025;

import java.util.HashMap;

public class Marathon {
    public String solution(String[] participant, String[] completion){
        HashMap<String, Integer> rnt = new HashMap<>();
        String str = "";
        for (String s : participant) {
            rnt.put(s, rnt.getOrDefault(s, 0)+1);
        }

        for (String s : completion) {
            rnt.put(s, rnt.get(s)-1);
        }

        for (String s : rnt.keySet()) {
            if (rnt.get(s) != 0)
                str = s;
        }

        return str;
    }

    public static void main(String[] args) {
        Marathon marathon = new Marathon();

        String[] participant1 = new String[]{"leo", "kiki", "eden"};
        String[] completion1 = new String[]{"eden", "kiki"};

        String[] participant2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};

        String[] participant3 = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = new String[]{"stanko", "ana", "mislav"};

        System.out.println(marathon.solution(participant1, completion1));
        System.out.println(marathon.solution(participant2, completion2));
        System.out.println(marathon.solution(participant3, completion3));

    }
}
