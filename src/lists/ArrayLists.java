package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * @author amgarg
 */
public class ArrayLists {


    public static void main(String[] args) {


        DynamicArray d = new DynamicArray();

        d.add(1);
        d.add(2);

        d.getElement(1);

        d.remove();

        d.size();

        List<Integer> list = new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);


        boolean isContains = list.contains(50);

        System.out.println(isContains);

        for(Integer integer : list) {
            System.out.println(integer);
        }

        list.add(0, 40);

        list.add(3, 60);

        list.remove(1);
        System.out.println("Changed List");

        for(Integer integer : list) {
            System.out.println(integer);
        }


        List<String> linkedList = new LinkedList<>();



    }
}
