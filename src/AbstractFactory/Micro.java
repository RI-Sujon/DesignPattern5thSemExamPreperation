package AbstractFactory;

public class Micro implements Car {
    String location ;
    String car = "Micro" ;

    Micro(String location)
    {
        this.location = location ;
        construct();
    }

    @Override
    public void construct()
    {
        System.out.println("Connecting to "+ location +" Micro car");
    }

    @Override
    public String toString() {
        return "Micro{" +
                "location='" + location + '\'' +
                ", car='" + car + '\'' +
                '}';
    }
}
