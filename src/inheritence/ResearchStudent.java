package inheritence;


public class ResearchStudent extends Student {

    //public studentName;
    //public studentRollNumber;



    public String researchSubject;

    //Creating research student
    public ResearchStudent(String studentName, long studentRollNumber, String researchSubject) {
        super(studentName, studentRollNumber); // Create the student first
        this.researchSubject = researchSubject;
    }


    @Override
    public void computeFees() {
        System.out.println("Computing the fees of Research Student");
    }

    public void printStudentName() {
        String studentName = getStudentName();
        System.out.println(studentRollNumber);
    }

}
