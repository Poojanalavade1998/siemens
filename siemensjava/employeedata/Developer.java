package employeedata;

public class Developer extends Employee {

    private String developerId;
    

    public Developer(int employeeage, String employeename, String employeedesignation, String employeedepartment, float employeesalary,String developerId) {
       super(employeeage, employeename, employeedesignation, employeedepartment, employeesalary);
        this.developerId = developerId;
    }



    public String getDeveloperId() {
        return this.developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }


}


