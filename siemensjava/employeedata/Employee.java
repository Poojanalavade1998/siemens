package employeedata;

public class Employee {
    
int employeeage;
String employeename;
String employeedesignation;
String employeedepartment;
float employeesalary;


    public Employee(int employeeage, String employeename, String employeedesignation, String employeedepartment, float employeesalary) {
        this.employeeage = employeeage;
        this.employeename = employeename;
        this.employeedesignation = employeedesignation;
        this.employeedepartment = employeedepartment;
        this.employeesalary = employeesalary;
    }


    public int getEmployeeage() {
        return this.employeeage;
    }

    public void setEmployeeage(int employeeage) {
        this.employeeage = employeeage;
    }

    public String getEmployeename() {
        return this.employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeedesignation() {
        return this.employeedesignation;
    }

    public void setEmployeedesignation(String employeedesignation) {
        this.employeedesignation = employeedesignation;
    }

    public String getEmployeedepartment() {
        return this.employeedepartment;
    }

    public void setEmployeedepartment(String employeedepartment) {
        this.employeedepartment = employeedepartment;
    }

    public float getEmployeesalary() {
        return this.employeesalary;
    }

    public void setEmployeesalary(float employeesalary) {
        this.employeesalary = employeesalary;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeage='" + getEmployeeage() + "'" +
            ", employeename='" + getEmployeename() + "'" +
            ", employeedesignation='" + getEmployeedesignation() + "'" +
            ", employeedepartment='" + getEmployeedepartment() + "'" +
            ", employeesalary='" + getEmployeesalary() + "'" +
            "}";
    }


}
