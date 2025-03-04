package enumeration.ex3;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println("value.name() = " + value.name());

        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}
