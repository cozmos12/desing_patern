package structuraldp.decoreder.simple1;

public class PhoneDecorator implements Phone{

    protected Phone basicPhone;

    public PhoneDecorator(Iphone basicPhone) {
        this.basicPhone = basicPhone;
    }
    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public int price() {
        return basicPhone.price();
    }
}
