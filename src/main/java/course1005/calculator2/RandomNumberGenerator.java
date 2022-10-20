package course1005.calculator2;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate(int num) {
        num = (int)(Math.random()*10);
        return num;
    }
}
