package BehavioralDesignPatterns.ChainOfResponsibility;


public class VicePresident extends Approver {
    private static final int APPROVAL_LIMIT = 10000;

    @Override
    public void approveRequest(int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Vice President approved the request of $" + amount);
        } else {
            System.out.println("Request of $" + amount + " needs further approval");
        }
    }
}
