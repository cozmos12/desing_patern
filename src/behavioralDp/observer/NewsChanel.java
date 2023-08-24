package behavioralDp.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChanel implements Chanel {
    private List<String> newsList=new ArrayList<String>();
    @Override
    public void update(String news) {

        newsList.add(news);

    }

    @Override
    public void printNews() {

        for(String news : newsList){
            System.out.println(news);
        }
    }
}
