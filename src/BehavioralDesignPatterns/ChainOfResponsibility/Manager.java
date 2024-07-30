package BehavioralDesignPatterns.ChainOfResponsibility;

//Next, we'll create concrete handlers that extend the abstract handler:

public class Manager extends Approver {
    private static final int APPROVAL_LIMIT = 1000;

    @Override
    public void approveRequest(int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Manager approved the request of $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
