package AbstractFactory;

public class USACarFactory implements AbstractFactory {
    private String location = "USA" ;

    @Override
    public Car buildCar(String model)
    {
        Car car = null;
        switch (model)
        {
            case "MICRO":
                car = new Micro(location);
                break;

            case "LUXURY":
                car = new Luxury(location);
                break;

            default:
                break;
        }
        return car;
    }
}
