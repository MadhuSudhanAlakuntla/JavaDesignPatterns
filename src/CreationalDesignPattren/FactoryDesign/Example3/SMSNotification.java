package CreationalDesignPattren.FactoryDesign.Example3;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}
