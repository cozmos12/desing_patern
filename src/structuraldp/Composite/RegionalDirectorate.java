package structuraldp.Composite;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDirectorate implements Department{
    List<Department> childDepartments;

    public RegionalDirectorate(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    public String getName() {
        return childDepartments.stream()
                .map(Department::getName).
                collect(Collectors.joining(", "));
    }

    @Override
    public List<String> GetEmployees() {
        return childDepartments.stream()
                .flatMap(d->d.GetEmployees().stream())
                .collect(Collectors.toList());
    }
}
