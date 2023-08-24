package structuraldp.decoreder.simple2.taxUtil;

public abstract  class TaxDecoder implements TaxInterface {
    protected TaxInterface taxComponent;
    protected TaxDecoder(TaxInterface taxComponent) {
        this.taxComponent = taxComponent;
    }
    public abstract double calculate();
}
