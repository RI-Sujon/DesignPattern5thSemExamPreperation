package FactoryMethod;

public class MainClass {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory() ;
        Notification notification = factory.createNotification("SMS") ;
        notification.notifyUser();

        notification = factory.createNotification("Email") ;
        notification.notifyUser() ;
    }
}
