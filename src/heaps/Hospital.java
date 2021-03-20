package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author amgarg
 */
public class Hospital {

    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();


        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>(new PatientComparator());

        Patient patient1 = new Patient("xyz", 5, 25, "Coughing");

        patients.add(patient1);

        priorityQueue.add(patient1);

        Patient patient2 = new Patient("abc", 5, 30, "Coughing");

        patients.add(patient2);

        priorityQueue.add(patient2);

        Patient patient3 = new Patient("ghi", 5, 20, "Broken Arm");

        patients.add(patient3);

        priorityQueue.add(patient3);

        Patient patient4 = new Patient("def", 5, 20, "Broken Arm");

        patients.add(patient4);

        priorityQueue.add(patient4);



        //Iterate Over the priority queue
        while(!priorityQueue.isEmpty()) {

            Patient patient = priorityQueue.poll();
            System.out.println(patient.getPatientName());
        }

        Patient patient5 = new Patient("def", 5, 20, "Broken Arm");

        patients.add(patient5);

        priorityQueue.add(patient5);



       /* System.out.println("Sequence of patients");

        for(Patient patient : patients) {
            System.out.println(patient.getPatientName());
        }

        //Sorting the patients Array list
        Collections.sort(patients, new PatientComparator());

        System.out.println("Treatment sequence of patients");
        for(Patient patient : patients) {
            System.out.println(patient.getPatientName());
        }*/



       //Min Priority Queue
       CustomMinPriorityQueue customPriorityQueue = new CustomMinPriorityQueue();

       customPriorityQueue.add(2);
       customPriorityQueue.add(4);
       customPriorityQueue.add(-3);
        customPriorityQueue.add(1);

      int removedElement =  customPriorityQueue.remove();

        System.out.println(removedElement);





    }
}
