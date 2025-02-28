package lang.string;

public class StringTest {
    public static void main(String[] args) {
        String a = "hello";
        System.out.println("a = " + a.hashCode());
        String b = "hello";
        System.out.println("b = " + b.hashCode());
    }
}
