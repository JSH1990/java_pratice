package generic.ex3;

public class AnimalHospitalV3<T extends Animal>{
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void check(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target){
        return animal.getSize() > target.getSize() ? animal:target;
    }
}
