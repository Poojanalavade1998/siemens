package studentexample;

public class Student {
    private String StudentName;
    private String Branch;
    private int RollNo;
    private int Age;


    public Student(String StudentName, String Branch, int RollNo, int Age) {
        this.StudentName = StudentName;
        this.Branch = Branch;
        this.RollNo = RollNo;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "{" +
            " StudentName='" + getStudentName() + "'" +
            ", Branch='" + getBranch() + "'" +
            ", RollNo='" + getRollNo() + "'" +
            ", Age='" + getAge() + "'" +
            "}";
    }

    public String getStudentName() {
        return this.StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getBranch() {
        return this.Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public int getRollNo() {
        return this.RollNo;
    }

    public void setRollNo(int RollNo) {
        this.RollNo = RollNo;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
}
