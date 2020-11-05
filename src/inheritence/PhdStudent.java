package inheritence;


public class PhdStudent extends ResearchStudent {


    private String thesisSubject;

    //Creating phd student
    public PhdStudent(String studentName, long studentRollNumber, String researchSubject) {
        super(studentName, studentRollNumber, researchSubject); //Create the research student
        this.thesisSubject = researchSubject;
    }

    @Override
    public void computeFees() {
        System.out.println("Computing the fees of Phd Student");
    }

    public String getThesisSubject() {
        return thesisSubject;
    }
}
