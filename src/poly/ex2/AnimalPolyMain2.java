package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] animalArr = {dog, cat};

        for (Animal animal : animalArr) {
            animal.sound();
        }
    }
}
