package inheritence;


import inheritence.PhdStudent;
import inheritence.ResearchStudent;
import inheritence.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass  {

    public static void main(String[] args) {

//        ResearchStudent researchStudent = new ResearchStudent();
//        researchStudent.studentName = "xyz";
//        researchStudent.studentRollNumber = 123;
//        researchStudent.researchSubject = "Unconscious Cognitive Bias";
//        researchStudent.printStudentName();
//        System.out.println(researchStudent.studentRollNumber + " " + researchStudent.researchSubject);


        //Research Student is a Research student
//        ResearchStudent researchStudent = new ResearchStudent("xyz",
//                123, "Unconscious Cognitive Bias");
//
//        System.out.println(researchStudent.studentRollNumber + " " + researchStudent.researchSubject);
//
//        researchStudent.getDetails();

        Student student = new Student("ghf", 987);


        //Research student is a student
        Student researchStudent = new ResearchStudent("abc", 123,
                "Software Engineering");



        Student phdStudent = new PhdStudent("abc", 123,
                "Software Engineering");










//        PhdStudent phdStudent = new PhdStudent("xyz",
//                123, "Unconscious Cognitive Bias");
//
//        String subject = phdStudent.getThesisSubject();
//
//        System.out.println(subject);
//
//        Student student = new Student("xyz", 123);
//        double studentRollNumber = student.studentRollNumber;


        Student [] students = new Student[3];

        students[0] = student;
        students[1] = researchStudent;
        students[2] = phdStudent;
      //  students[4] = masterStudent

        Professor professor = new Professor();
        professor.getDetails();
        professor.show();

        System.out.println(professor.a);

        ArrayList<Student> studentsList = new ArrayList();
        studentsList.add(student);
        studentsList.add(researchStudent);
        studentsList.add(phdStudent);

        boolean contains = studentsList.contains(phdStudent);
        System.out.println(contains);

        for(int i = 0; i < studentsList.size(); i++ ) {
            Student s1 = studentsList.get(i);
            s1.getDetails();
        }

        int [] array = new int[5];

        ArrayList<Integer> list = new ArrayList();

        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(0));



        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        printDetails(students);


        LinkedList linkedList = new LinkedList();
        linkedList.add("String 1");
        linkedList.add("String 2");
        linkedList.add(1);








    }


    static void printDetails(Student [] students) {
        for (Student student : students) { //student = phd student
            student.getDetails();
        }
    }
}
