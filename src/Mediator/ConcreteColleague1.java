package Mediator;

public class ConcreteColleague1 implements Colleague{
    private Mediator mediator;
    //runway

    public ConcreteColleague1(Mediator mediator)
    {
        this.mediator = mediator;
        //mediator.setLandingStatus(true);
    }

    @Override
    public void land()
    {
        System.out.println("Landing permission granted.");
        mediator.setLandingStatus(true);
    }
}
