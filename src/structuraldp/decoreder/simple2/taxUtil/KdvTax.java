package structuraldp.decoreder.simple2.taxUtil;

public class KdvTax extends TaxDecoder {
    private double kdvRate=0.17;


    public KdvTax(TaxInterface taxComponent) {
        super(taxComponent);

    }

    public double calculate(){
        double basePrice=taxComponent.calculate();
        double kdv=basePrice*kdvRate;
        return basePrice+kdv;
    }

}
