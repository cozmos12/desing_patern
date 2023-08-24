package structuraldp.Composite;

import java.util.List;

public class Finance implements Department{
    @Override
    public String getName() {
        return "finance";
    }

    @Override
    public List<String> GetEmployees() {
        return null;
    }
}
