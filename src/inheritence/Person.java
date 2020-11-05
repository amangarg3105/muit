package inheritence;

public abstract class Person {

     public  void getDetails() {
         System.out.println("Details of Person");
        computeSalary();
    }


     abstract public void computeSalary();

}
