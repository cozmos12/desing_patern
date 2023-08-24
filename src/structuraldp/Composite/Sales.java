package structuraldp.Composite;

import java.util.List;

public class Sales implements Department
{
    @Override
    public String getName() {
        return "sales";
    }

    @Override
    public List<String> GetEmployees() {
        return null;
    }
}
