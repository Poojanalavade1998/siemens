package Solid;

public class Student {
    private String studentId;
    private String studentCourse;
    private StudentMarks studentMarksObj;


    public Student(String studentId, String studentCourse, StudentMarks studentMarksObj) {
        this.studentId = studentId;
        this.studentCourse = studentCourse;
        this.studentMarksObj = studentMarksObj;
    }


    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentCourse() {
        return this.studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public StudentMarks getStudentMarksObj() {
        return this.studentMarksObj;
    }

    public void setStudentMarksObj(StudentMarks studentMarksObj) {
        this.studentMarksObj = studentMarksObj;
    }


    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", studentCourse='" + getStudentCourse() + "'" +
            ", studentMarksObj='" + getStudentMarksObj() + "'" +
            "}";
    }


    public static void main(String[] args){

    Student s1 = new Student("101", "Engineering", new StudentMarks(new int[]{40,41,42,43,45}));

s1.studentMarksObj.calculateTotalStudentMarks();

}
}
