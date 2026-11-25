public class Bitwise {

    // AND: bit is 1 only if BOTH bits are 1
    public static int bitwiseAND(int a, int b) {
        return a & b;
    }

    // OR: bit is 1 if AT LEAST ONE bit is 1
    public static int bitwiseOR(int a, int b) {
        return a | b;
    }

    // XOR: bit is 1 if the bits are DIFFERENT
    public static int bitwiseXOR(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseAND(7, 12)); // 4
        System.out.println(bitwiseOR(7, 12));  // 15
        System.out.println(bitwiseXOR(7, 12)); // 11
    }
}