package structuraldp.decoreder.simple1;

public class Iphone implements Phone{
    @Override
    public String getName() {
        return "iphone";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public int price() {
        return 10000;
    }
}
