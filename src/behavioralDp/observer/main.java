package behavioralDp.observer;

public class main {
    public static void main(String[] args) {
        main m=new main();
        m.Observation();
    }

    void Observation(){

        Chanel chanel1=new NewsChanel();
        Chanel chanel2=new NewsChanel();
        Chanel chanel3=new NewsChanel();
        NewAcent acent=new NewAcent();
        acent.addChanel(chanel1);
        acent.addChanel(chanel2);
        acent.addChanel(chanel3);
        acent.AddNews("news");
        chanel1.printNews();

    }
}
