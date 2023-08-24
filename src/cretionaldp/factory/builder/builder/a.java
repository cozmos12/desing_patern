package cretionaldp.factory.builder.builder;

import cretionaldp.factory.builder.builder.Product;

public class a {
    public static class main {
        public static void main(String[] args) {
            Product product=new Product.PrductBuilder().id(1).names("meki").Build();

            System.out.println(product.getName()
            );
        }
    }
}
