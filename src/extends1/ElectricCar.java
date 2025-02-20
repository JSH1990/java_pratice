package extends1;

public class ElectricCar extends Car{
    @Override
    public void move() {
        System.out.println("test");
    }

    public void charge(){
        System.out.println("충전합니다.");
    }


}
