package behavioralDp.chainOfResponsibility;

public class main {
    public static void main(String[] args) {

        main main=new main();
        main.chainOfResponsibilityDemo();
    }

    void chainOfResponsibilityDemo(){
        Aprover Directory=new Directory();
        Aprover manager=new Manager(Directory);
        Aprover officer=new Officer(manager);

    }
}
