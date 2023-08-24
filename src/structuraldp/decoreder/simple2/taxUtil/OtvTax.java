package structuraldp.decoreder.simple2.taxUtil;

public class OtvTax extends TaxDecoder {

    private double otvRate=0.9;


    public OtvTax(TaxInterface taxComponent) {
        super(taxComponent);
    }

    public double calculate(){
        double basePrice=taxComponent.calculate();
        double kdv=basePrice*otvRate;
        return basePrice+kdv;
    }
}
