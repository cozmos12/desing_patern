package behavioralDp.chainOfResponsibility;

public abstract class Aprover {
    Aprover chief;

    public Aprover(Aprover chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
