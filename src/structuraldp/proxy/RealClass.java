package structuraldp.proxy;

public class RealClass implements ImageGenerator{

    public String path;

    RealClass(String path){

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void showImage() {

        System.out.println(path);
    }
}
