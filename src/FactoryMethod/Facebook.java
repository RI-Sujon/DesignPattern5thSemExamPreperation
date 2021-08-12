package FactoryMethod;

public class Facebook implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Facebook Notification");
    }
}
