package course1118;

public class Caesar {

    public String solution (String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ')
                sb.append(' ');
            else if ((int)c >= 97 && (int)c <= 122) {
                sb.append((char)(((s.charAt(i) - 97 + n) % 26) + 97));
            } else {
                sb.append((char)(((s.charAt(i) - 65 + n) % 26) + 65));
            }
        }

        String ans = sb.toString();

        return ans;
    }
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        System.out.println(caesar.solution("z", 1));
    }
}
