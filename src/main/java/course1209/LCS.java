package course1209;

public class LCS {
    public static void main(String[] args) {
        String s1 = "ABCDCBA"; // 열
        String s2 = "DCABDC"; // 행

        // s2인 DCABDC를 i로 놓고 바깥쪽에서 반복할 예정 //행
        // s1인 ABCDCBA를 j로 놓고 안쪽에서 반복할 예정 //열
        
        int[][] dp = new int[s2.length()][s1.length()];

        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                System.out.printf("i:%s j:%s\n", s2.charAt(i), s1.charAt(j));
            }
        }
    }
}
