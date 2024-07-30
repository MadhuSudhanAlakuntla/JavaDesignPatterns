package BehavioralDesignPatterns.ChainOfResponsibility;


//First, we'll define an abstract handler that declares
// a method for processing the request and holds a reference to the next handler in the chain:

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void approveRequest(int amount);
}
