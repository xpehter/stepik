public class s9 {
    public static boolean isPowerOfTwo(int value) {
        int mod_value = value * (value >>> 31) * (-1) + value * ((value >>> 31) - 1) * (-1);
        return ((mod_value & (mod_value - 1)) == 0) ^ (value == value * 2);
    }
}
