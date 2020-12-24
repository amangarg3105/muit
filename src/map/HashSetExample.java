package map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author amgarg
 */
public class HashSetExample {


    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        for(int i = 0; i < 100000; i++) {
            set.add(i);
        }

        for(Integer value : set) {
            System.out.println(value);
        }

    }
}
