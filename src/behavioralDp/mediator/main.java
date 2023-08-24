package behavioralDp.mediator;

public class main {
    public static void main(String[] args) {
        main main=new main();
        main.mediatorDemo();
    }

    void mediatorDemo(){
        MessageDispatcher messageDispatcher=new MessageDispatcher();
        Actor actor1=new MessageActor("a",messageDispatcher);
        Actor actor2=new MessageActor("b",messageDispatcher);

        Actor actor3=new MessageActor("c",messageDispatcher);
        messageDispatcher.registerActor("topic1",actor1);
        messageDispatcher.registerActor("topic2",actor2);

        messageDispatcher.registerActor("topic3",actor3);

        actor1.sendMessage("topic2","topic2message");


    }
}
