package Mediator;

public class ConcreteColleague2 implements Colleague {
    private Mediator mediator;

    //flight

    public ConcreteColleague2(Mediator mediator)
    {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        if (mediator.isLandingOk())
        {
            System.out.println("Successfully Landed.");
            //mediator.setLandingStatus(true);
        }
        else
            System.out.println("Waiting for landing.");
    }

    public void getReady()
    {
        System.out.println("Ready for landing.");
    }
}
