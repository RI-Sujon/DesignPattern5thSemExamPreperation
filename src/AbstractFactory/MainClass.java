package AbstractFactory;

public class MainClass {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory("India") ;

        Car car = carFactory.buildCar("MICRO");

        System.out.println(car.toString());
    }
}
