package behavioralDp.mediator;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{
    Map<String,Actor> registeredActorMap = new HashMap<String,Actor>();

    void registerActor(String topic, Actor actor){
        registeredActorMap.put(topic, actor);
    }
    @Override
    public void dispatch(String topic, String message) {

        Actor actor=registeredActorMap.get(topic);
        if(actor==null){
            System.out.println("No actor registered");
        }else{
            actor.receiveMessage(message);
        }
    }
}
