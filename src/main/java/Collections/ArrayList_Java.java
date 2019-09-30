package Collections;

import java.util.ArrayList;

public class ArrayList_Java {
    public static void main(String[] args) {

        java.util.ArrayList lst = new java.util.ArrayList(); // Not apply Generics, can put anything to the list
        lst.add(new String("Hello"));
        lst.add(new Integer(3));
        System.out.println(lst);

        java.util.ArrayList<String> lst2 = new java.util.ArrayList(); //Apply Generics, can put only string to the list
        lst2.add(new String("Hello"));
//        lst2.add(new Integer(3));//Error
        System.out.println(lst2);

    }
}
