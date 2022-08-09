package example.overloadingexamples;


//calculate total marks of student
public class Student {

    private String studentId;
    private boolean studentEnrollInElective;
    private int[] studentMarks;
    private int studentSubjects;


    public Student(String studentId, boolean studentEnrollInElective, int studentSubjects ) {
        this.studentId = studentId;
        this.studentEnrollInElective = studentEnrollInElective;
        this.studentSubjects = studentSubjects;
        
    }


    public Student(String studentId, boolean studentEnrollInElective, int[] studentMarks, int studentSubjects) {
        this.studentId = studentId;
        this.studentEnrollInElective = studentEnrollInElective;
        this.studentMarks = studentMarks;
        this.studentSubjects = studentSubjects;
    }

    //if student is enrolled for electivr,they get 50 marks bonus




    //for regular student,bonus marks 10%

    void calculateTotalMarks(){
        int total=0;
        if(this.studentEnrollInElective){
            total+=50;
       
        }




    



    //for some student, a separate SOCIAL WORK
public static void main(String[] args){

int [] arr = new int[]{1,2,3,4,5};

Student  s1 =new Student("st101", false, new int[]{40,43,45,42,42}, 5);


}   

}

