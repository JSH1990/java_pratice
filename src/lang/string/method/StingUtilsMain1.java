package lang.string.method;

public class StingUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java";

        String numString = String.valueOf(num);
        System.out.println("numString = " + numString);

        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            System.out.println("c = " + c);

        }
    }
}
