package State;

public class Vibration implements MobileState {
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Vibration");
    }
}
