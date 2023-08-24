package cretionaldp.factory.builder.singleton;

public class Singleton {
    public void getMessage(){
        System.out.println("Singleton");
    }

    private Singleton(){}

    public static Singleton singleton=new Singleton();

    public static Singleton getSingleton(){
        return singleton;
    }

}
