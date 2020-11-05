package inheritence;

/**
 * @author amgarg
 */
public interface ProfessionOperations {


    public static final  int a = 10;

    default void show() {
        System.out.println("This method is used for show for operations");
    }

     void getDetails();


     void computerSalary();








}
