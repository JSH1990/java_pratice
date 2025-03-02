package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, java!";

        System.out.println("str.contains(\"hello\") = " + str.contains("hello"));
        System.out.println("str.contains(\"hello\") = " + str.contains("Hello"));
    }
}
