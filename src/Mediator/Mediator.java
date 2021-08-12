package Mediator;

public interface Mediator {
    public void registerRunway(ConcreteColleague1 runway);

    public void registerFlight(ConcreteColleague2 flight);

    public boolean isLandingOk();

    public void setLandingStatus(boolean status);

    public void landing();
}
