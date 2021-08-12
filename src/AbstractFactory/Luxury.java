package AbstractFactory;

public class Luxury implements Car {
    String location ;
    String car = "Luxury" ;

    Luxury(String location)
    {
        this.location = location ;
        construct();
    }

    @Override
    public void construct()
    {
        System.out.println("Connecting to "+ location +" luxury car.");
    }

    @Override
    public String toString() {
        return "Luxury{" +
                "location='" + location + '\'' +
                ", car='" + car + '\'' +
                '}';
    }
}
