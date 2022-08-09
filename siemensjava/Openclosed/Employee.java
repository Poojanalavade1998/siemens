package Openclosed;

public class Employee {
    private String employeeId;
    private float employeeSalary;



    public Employee(String employeeId, float employeeSalary) {
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }


    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public float getEmployeeSalary() {
        return this.employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeId='" + getEmployeeId() + "'" +
            ", employeeSalary='" + getEmployeeSalary() + "'" +
            "}";
    }
    
}
