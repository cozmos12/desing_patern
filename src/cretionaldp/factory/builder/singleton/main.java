package cretionaldp.factory.builder.singleton;

import cretionaldp.factory.builder.singleton.Singleton;

public class main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getSingleton();
        singleton.getMessage();
    }
}
