package BehavioralDesignPatterns.ChainOfResponsibility;

//Client
//Finally, the client sets up the chain of handlers and makes requests:

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vicePresident = new VicePresident();

        manager.setNextApprover(director);
        director.setNextApprover(vicePresident);

        // Test different requests
        manager.approveRequest(500);
        manager.approveRequest(2000);
        manager.approveRequest(7000);
        manager.approveRequest(15000);
    }
}
