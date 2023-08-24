package structuraldp.decoreder.simple2.taxUtil;


public class BaseTax implements TaxInterface {

    private double price;


    public BaseTax(double price) {
        this.price=price;
    }

    @Override
    public double calculate() {
        System.out.println("price"+price);
        return price;

    }
}
