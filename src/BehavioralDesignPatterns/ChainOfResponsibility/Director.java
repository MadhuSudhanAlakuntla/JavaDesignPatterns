package BehavioralDesignPatterns.ChainOfResponsibility;

public class Director extends Approver {
    private static final int APPROVAL_LIMIT = 5000;

    @Override
    public void approveRequest(int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Director approved the request of $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}
