package CreationalDesignPattren.FactoryDesign.Example3;

//Next, we'll create concrete classes that implement the Notification interface:
public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
