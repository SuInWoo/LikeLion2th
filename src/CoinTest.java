import java.util.Scanner;

public class CoinTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("금액을 입력하세요.");
        int refund = sc.nextInt();

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.printf("50000원: %d장\n",refund/curr50000);
        refund = refund%curr50000;
        System.out.printf("10000원: %d장\n",refund/curr10000);
        refund = refund%curr10000;
        System.out.printf("5000원: %d장\n",refund/curr5000);
        refund = refund%curr5000;
        System.out.printf("1000원: %d장\n",refund/curr1000);
        refund = refund%curr1000;
        System.out.printf("500원: %d장\n",refund/curr500);
        refund = refund%curr500;
        System.out.printf("100원: %d장\n",refund/curr100);
        refund = refund%curr100;
        System.out.printf("50원: %d장\n",refund/curr50);
        refund = refund%curr50;
        System.out.printf("10원: %d장\n",refund/curr10);
        refund = refund%curr10;

    }
}
