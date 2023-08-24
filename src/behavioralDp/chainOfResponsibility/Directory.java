package behavioralDp.chainOfResponsibility;

public class Directory extends Aprover{
    public Directory() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {
        return true;
    }
}
