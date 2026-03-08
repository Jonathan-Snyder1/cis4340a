//compliant version
// replace assertions with explicit checks and throw IllegalArgumentExecption
//Never use assertions to validate method arguments per rules

public class R06_MET01_J {

    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }

        return absX + absY;
    }

    public static void main(String[] args) {
        System.out.println(getAbsAdd(10, 20));
    }
}
