package State;

public class Silent implements MobileState {
    @Override
    public void alert(AlertStateContext context) {
        System.out.println("Silent");
    }
}
