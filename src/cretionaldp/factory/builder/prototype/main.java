package cretionaldp.factory.builder.prototype;

public class main {
    public static void main(String[] args) {
        Prototype prototype=new Prototype(100,50,40,true);
        Prototype prototype1=prototype.clone();
        prototype1.life=false;
    }
}
