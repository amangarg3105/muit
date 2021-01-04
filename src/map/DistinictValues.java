package map;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author amgarg
 */
public class DistinictValues {


    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();

        Set<Character> set = new LinkedHashSet<>();

        for(Character key : map.keySet()) {
            set.add(key);
        }

        for(Character value : set) {
            System.out.println(value);
        }
    }
}
