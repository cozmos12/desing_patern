package behavioralDp.chainOfResponsibility;

public class Manager extends Aprover{
    public Manager(Aprover chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if(amount<500){

            return true;
        }else if(chief!=null){
            return   chief.approveLoan(amount);
        }
        return false;    }
}
