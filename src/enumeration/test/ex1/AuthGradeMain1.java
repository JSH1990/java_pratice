package enumeration.test.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("value.name() = " + value.name());
            System.out.println("value.getDescription() = " + value.getDescription());
            System.out.println("value.getLevel() = " + value.getLevel());

        }
    }
}
