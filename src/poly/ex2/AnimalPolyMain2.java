package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        action(dog);
    }

    private static void action(Object obj) {
        if(obj instanceof Dog dog){
            dog.sound();
        }
    }
}
