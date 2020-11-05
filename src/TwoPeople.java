/**
 * @author amgarg
 */
public class TwoPeople {


    static boolean twoPeopleMeet(int x1, int x2, int s1, int s2) {

        if(x1 > x2 && s1 > s2) {
            return false;
        }
        if(x2 > x1 && s2 > s1) {
            return false;
        }


        if(x1 < x2) {
           //
        }


//Check if they will cross each other or not
        while (x1 >= x2) {
            if (x1 == x2) {
                return true;
            }
            x1 = x1 + s1;
            x2 = x2 + s2;
        }
        return false;
    }

    static boolean twoPeopleOptimize(int x1, int x2, int s1, int s2)  {
        if(x1 > x2 && s1 > s2) {
            return false;
        }
        if(x2 > x1 && s2 > s1) {
            return false;
        }


        int relativeDistance = Math.abs(x1 - x2);
        int relativeSpeed = Math.abs(s1 - s2);

       if(relativeDistance % relativeSpeed == 0) {
           return true;
       } else
          return  false;
    }

    public static void main(String[] args) {

        int x1 = 8;
        int x2 = 6;
        int s1 = 2;
        int s2 = 3;

        if(twoPeopleMeet(x1, x2, s1, s2)) {
            System.out.println("They will meet");
        } else
            System.out.println("They will not meet");
    }
}
