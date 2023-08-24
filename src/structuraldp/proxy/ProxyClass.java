package structuraldp.proxy;

public class ProxyClass implements ImageGenerator{

    RealClass realClass;
    String path;
    @Override
    public void showImage() {
        if(realClass==null){
            realClass=new RealClass(path);
            realClass.showImage();
        }
    }
}
