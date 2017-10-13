import java.math.BigInteger;

public class s8 {
    public static BigInteger factorial(int value) {
        BigInteger znach = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            znach = znach.multiply(BigInteger.valueOf(i));
        }
        return znach;
    }
}
