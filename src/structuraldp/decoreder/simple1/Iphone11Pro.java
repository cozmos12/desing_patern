package structuraldp.decoreder.simple1;

public class Iphone11Pro extends PhoneDecorator{
    public Iphone11Pro(Iphone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11 Pro";
    }

    @Override
    public int price() {
        return super.price()+400;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }
}
