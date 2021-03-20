package heaps;


public class Patient {

    private String patientName;

    private int emergencyLevel;

    private double age;

    private String problem;

    public Patient(String patientName, int emergencyLevel, double age, String problem) {
        this.patientName = patientName;
        this.emergencyLevel = emergencyLevel;
        this.age = age;
        this.problem = problem;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getEmergencyLevel() {
        return emergencyLevel;
    }

    public double getAge() {
        return age;
    }

    public String getProblem() {
        return problem;
    }
}
