package FactoryMethod;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        if ("SMS".equals(channel)) {
            return new SMS();
        }
        else if ("Email".equals(channel)) {
            return new Email();
        }
        else if ("Facebook".equals(channel)) {
            return new Facebook();
        }
        return null;
    }
}
