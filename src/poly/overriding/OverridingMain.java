package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        System.out.println(STR."value = \{poly.value}");
        poly.method();
    }
}
