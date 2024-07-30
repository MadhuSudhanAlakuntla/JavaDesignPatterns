package CreationalDesignPattren.FactoryDesign.Example3;

//Finally, the client code will use the factory to get an object
// of the desired notification type and call its send method:
public class FactoryPatternTest {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        // Get an object of EmailNotification and call its send method
        Notification notification1 = notificationFactory.getNotification("EMAIL");
        notification1.send();

        // Get an object of SMSNotification and call its send method
        Notification notification2 = notificationFactory.getNotification("SMS");
        notification2.send();

        // Get an object of PushNotification and call its send method
        Notification notification3 = notificationFactory.getNotification("PUSH");
        notification3.send();
    }
}
