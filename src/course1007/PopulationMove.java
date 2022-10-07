package course1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    //constructor 추가

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }
}
