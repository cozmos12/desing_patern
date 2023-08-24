package structuraldp.Composite;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

    }

    public void CompositeDemo(){
        Department fianace=new Finance();
        Department sales=new Sales();
        Department regionalDepartment=new RegionalDirectorate(Arrays.asList(fianace,sales));
    }
}
