package map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {


    public static void putInContacts(String name, long number,
                                     HashMap<String, ArrayList<Long>> contacts) {

        if (contacts.containsKey(name)) {
            ArrayList<Long> temp = contacts.get(name);
            temp.add(number);
        } else {
            ArrayList<Long> tempContacts = new ArrayList<>();
            tempContacts.add(number);
            contacts.put(name, tempContacts);
        }
    }


    public static void showNumbersAgainstName(String name,
                                              HashMap<String, ArrayList<Long>> contacts) {

        ArrayList<Long> contactList = contacts.get(name);
        if(contactList.size() != 0) {
            System.out.println("Showing the numbers of " + name);
            for(Long contact : contactList) {
                System.out.println(contact);
            }
        }
    }




    public static void main(String[] args) {

        System.out.println("This is our Phonebook");

        //  Hashtable<String, ArrayList<Long>> contacts = new Hashtable<>();
        HashMap<String, ArrayList<Long>> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

       /*
       System.out.println("Give the name");
        String name = sc.nextLine();
        System.out.println("Give the number");
        Long number = sc.nextLong();
        */

        putInContacts("aman", 12345213, contacts);
        putInContacts("aman", 1234567, contacts);
        putInContacts("aarti", 897654, contacts);
        putInContacts("saqib", 9876521, contacts);
        putInContacts("saqib", 412312, contacts);

        showNumbersAgainstName("aman", contacts);
        showNumbersAgainstName("aarti", contacts);
        showNumbersAgainstName("saqib", contacts);


    }
}
