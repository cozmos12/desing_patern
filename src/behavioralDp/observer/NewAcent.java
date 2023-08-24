package behavioralDp.observer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NewAcent {

    private String news;

    private List<Chanel> chanel = new ArrayList<Chanel>();

    public void addChanel(Chanel chanel){
        this.chanel.add(chanel);
    }

    public void AddNews(String news){
        this.news = news;
        for(Chanel chanel :chanel){
            chanel.update(news);
        }
    }
}
