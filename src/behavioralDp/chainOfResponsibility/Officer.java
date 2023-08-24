package behavioralDp.chainOfResponsibility;

public class Officer extends Aprover{
    public Officer(Aprover chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if(amount<100){

            return true;
        }else if(chief!=null){
          return   chief.approveLoan(amount);
        }
        return false;
    }
}
