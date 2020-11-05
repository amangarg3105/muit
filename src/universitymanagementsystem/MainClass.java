package universitymanagementsystem;


public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 31;
        s1.studentName = "xyz";
        s1.registerCourse();

        Student s2 = new Student();
        s2.rollNo = 30;
        s2.studentName = "abc";
        s2.registerCourse();


        Course c1 = new Course();
        c1.courseId = 70;
        c1.courseName = "Compliers";


        System.out.println(s1.rollNo);
        System.out.println(s2.studentName);
        System.out.println(c1.courseName);
    }
}
