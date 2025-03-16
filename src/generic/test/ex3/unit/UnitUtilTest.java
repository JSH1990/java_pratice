package generic.test.ex3.unit;

public class UnitUtilTest {
    public static void main(String[] args) {
        Marine m1 = new Marine("마린1", 40);
        Marine m2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.maxUp(m1, m2);
        System.out.println("resultMarine = " + resultMarine);

    }
}
