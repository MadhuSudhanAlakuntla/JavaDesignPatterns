package CreationalDesignPattren.FactoryDesign.Example3;

public class PushNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Push Notification");
    }
}