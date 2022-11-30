package course1130;

import java.util.Scanner;

public class DistanceBetweenNodes {
    private static int getDistance(int a, int b) {
        if(a==b) return 0;

        if(a < b)
            return getDistance(a, Math.floorDiv(b, 2)) + 1;
        else
            return getDistance(Math.floorDiv(a, 2), b) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getDistance(a, b));
    }
}
