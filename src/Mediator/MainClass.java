package Mediator;

public class MainClass {
    public static void main(String args[])
    {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague2 sparrow101 = new ConcreteColleague2(mediator);
        ConcreteColleague1 mainRunway = new ConcreteColleague1(mediator);
        mediator.registerFlight(sparrow101);
        mediator.registerRunway(mainRunway);
        mediator.landing();
        //sparrow101.getReady();
        //mainRunway.land();
        //sparrow101.land();
        //mainRunway.land();
    }
}
