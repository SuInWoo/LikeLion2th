package course1005;

public class RandomCalculator {
    private int a;
    private int randomNum = (int)(Math.random()*10);
    public RandomCalculator(int a) {
        this.a = a;
    }

    public void plus(){
        System.out.println(a+(int)randomNum);
    }

    public void minus(){
        System.out.println(a-(int)randomNum);
    }

    public void multiple(){
        System.out.println(a*(int)randomNum);
    }

    public void divide(){
        if (randomNum == 0){
            System.out.println("랜덤하게 생성된 숫자가 0 입니다.");
        }else {
            System.out.println((float) (a / randomNum));
        }
    }
}
