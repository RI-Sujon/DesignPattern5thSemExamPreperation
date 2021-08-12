package Mediator;

public class ConcreteMediator implements Mediator{
    private ConcreteColleague2 flight;
    private ConcreteColleague1 runway;
    public boolean land;

    @Override
    public void registerRunway(ConcreteColleague1 runway) {
        this.runway = runway ;
    }

    @Override
    public void registerFlight(ConcreteColleague2 flight) {
        this.flight = flight ;
    }

    @Override
    public boolean isLandingOk() {
        return land ;
    }

    @Override
    public void setLandingStatus(boolean status) {
        land = status ;
    }

    @Override
    public void landing() {
        flight.getReady();
        runway.land();
        flight.land();
    }
}
