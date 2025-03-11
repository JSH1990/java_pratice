package nested.local;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
            }

            Printer printer = new LocalPrinter();
            printer.print();
            //test
        }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        localOuter.process(2);

    }
}
