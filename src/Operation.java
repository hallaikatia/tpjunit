public class Operation {
    private int x;
    private int y;

    public Operation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addition() {
        return x + y;
    }

    public int substraction() {
        return x - y;
    }

    public int multiplication() {
        return x * y;
    }

    public float division() {
        if (y != 0) return (float) x / y;
        throw new ArithmeticException("division par 0");
    }

}
