package inheritence;


public class Student extends  Person{

    protected String studentName;
    protected long studentRollNumber;
    protected String studentSubject;

    public BankAccount bankAccount;

    //Creating student
    public Student(String studentName, long studentRollNumber) {
        this.studentName = studentName;
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }




    public void computeFees() {
        System.out.println("Computing fees for student");
    }


    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a , float b) {
        return a + b;
    }


    @Override
    public void getDetails() {
        computeFees();
    }

    @Override
    public void computeSalary() {
        System.out.println("Computing the salary of Student");
    }
}
