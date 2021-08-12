package State;

public class AlertStateContext {
    MobileState state ;

    public AlertStateContext(){
        this.state = new Vibration() ;
    }

    public void setState(MobileState state) {
        this.state = state;
    }

    public void alert(){
        this.state.alert(this);
    }
}
