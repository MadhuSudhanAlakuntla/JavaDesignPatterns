package CreationalDesignPattren.FactoryDesign.Example3;


//Now, we'll create a factory class to generate the concrete notification
// objects based on the given information:
public class NotificationFactory {
    // Use getNotification method to get an object of type Notification
    public Notification getNotification(String notificationType) {
        if (notificationType == null) {
            return null;
        }
        if (notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        return null;
    }
}
