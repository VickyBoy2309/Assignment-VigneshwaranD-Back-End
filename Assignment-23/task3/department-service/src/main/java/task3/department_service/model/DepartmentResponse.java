package task3.department_service.model;

public class DepartmentResponse {

    private String departmentName;
    private Employee employee;

    public DepartmentResponse(
            String departmentName,
            Employee employee
    ) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getEmployee() {
        return employee;
    }
}