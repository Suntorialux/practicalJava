package Lesson2;

/**
 * Created by Андрей on 29.06.2015.
 */
public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2=new Car();

        car1.color="Red";
        car2.color="Yellow";

        System.out.println("I've painted the car");
        System.out.println("I've painted the car "+car1.color);
        System.out.println("I've painted the car "+car2.color);
    }

}
