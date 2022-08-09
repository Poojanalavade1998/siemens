package salaryportal;

public class ManagerEmployee extends SalariedEmployee{
 
    private  String managerEmployeeTeamSize;

    public ManagerEmployee(String salariedEmployeeId, String salariedEmployeeName, String salariedEmployeeDesignation, SalaryComponent salaryAmount, EmployeeAddress salariedEmployeeAddress,String managerEmployeeTeaamsize){

        super(salariedEmployeeId, salariedEmployeeName, salariedEmployeeDesignation, salaryAmount, salariedEmployeeAddress);
        this.managerEmployeeTeamSize = managerEmployeeTeaamsize;
    }

@Override 
void calculateTax(){

    System.out.println("Tax for Manager: ");
}



}
