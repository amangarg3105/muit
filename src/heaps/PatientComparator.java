package heaps;


import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        if (o1.getEmergencyLevel() < o2.getEmergencyLevel()) {
            return 1; //swap
        } else if(o1.getEmergencyLevel() > o2.getEmergencyLevel()) {
            return -1;
        }
        return 0;

    }
}
