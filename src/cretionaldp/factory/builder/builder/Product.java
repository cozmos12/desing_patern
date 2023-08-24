package cretionaldp.factory.builder.builder;

public class Product {
    private int price;
    private String name;
    private int id;

    public Product(PrductBuilder prductBuilder) {
        this.id=prductBuilder.id;
        this.price=prductBuilder.price;
        this.name=prductBuilder.name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class PrductBuilder {
        private int price;
        private String name;
        private int id;

        public PrductBuilder id(int id){
            this.id=id;
            return this;
        }

        public PrductBuilder price(int price){
            this.price = price;
            return this;
        }

        public PrductBuilder names(String name){
            this.name = name;
            return this;
        }

        public Product Build(){
            Product product=new Product(this);
            return product;
        }
    }
}
