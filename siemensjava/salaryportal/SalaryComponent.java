package salaryportal;


public class SalaryComponent {
 private float SalaryBasic;
private float salaryProfessionTax;
private float salaryTdsAmount;


    //Scenario where TDS  deduction is taking place
    public SalaryComponent(float SalaryBasic, float salaryProfessionTax, float salaryTdsAmount) {
        this(SalaryBasic, salaryProfessionTax);
        this.salaryTdsAmount = salaryTdsAmount;
    }
    //Scenario where no tds deduction is takes place
    public SalaryComponent(float SalaryBasic, float salaryProfessionTax) {
        this.SalaryBasic = SalaryBasic;
        this.salaryProfessionTax = salaryProfessionTax;
}

    public float getSalaryBasic() {
        return this.SalaryBasic;
    }

    public void setSalaryBasic(float SalaryBasic) {
        this.SalaryBasic = SalaryBasic;
    }

    public float getSalaryProfessionTax() {
        return this.salaryProfessionTax;
    }

    public void setSalaryProfessionTax(float salaryProfessionTax) {
        this.salaryProfessionTax = salaryProfessionTax;
    }

    public float getSalaryTdsAmount() {
        return this.salaryTdsAmount;
    }

    public void setSalaryTdsAmount(float salaryTdsAmount) {
        this.salaryTdsAmount = salaryTdsAmount;
    }
}