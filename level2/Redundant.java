import java.util.function.Supplier;

public class Redundant {

    // Returns a function that always returns str
    public static Supplier<String> redundant(String str) {
        return () -> str;
    }

    public static void main(String[] args) {
        Supplier<String> f1 = redundant("apple");
        Supplier<String> f2 = redundant("pear");
        Supplier<String> f3 = redundant("");

        System.out.println(f1.get()); // apple
        System.out.println(f2.get()); // pear
        System.out.println(f3.get()); // (empty)
    }
}