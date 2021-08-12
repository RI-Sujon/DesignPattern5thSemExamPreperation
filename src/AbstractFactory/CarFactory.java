package AbstractFactory;

public class CarFactory {
    private String location ;
    private AbstractFactory factory ;

    public CarFactory(String location){
        this.location = location ;
    }

    public Car buildCar(String carType){
        switch (location){
            case "India":
                factory = new IndiaCarFactory();
                return factory.buildCar(carType) ;

            case "USA":
                factory = new USACarFactory();
                return factory.buildCar(carType);

            default:
                return null ;
        }
    }
}
