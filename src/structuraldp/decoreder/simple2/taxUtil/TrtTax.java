package structuraldp.decoreder.simple2.taxUtil;

public class TrtTax extends TaxDecoder {
    private double trtRate=0.25;

    public TrtTax(TaxInterface taxComponent) {
        super(taxComponent);
    }

    public double calculate(){
        double basePrice=taxComponent.calculate();
        double kdv=basePrice*trtRate;
        return basePrice+kdv;
    }
}
