package Sort;

import java.util.Arrays;

public class Sort_SimpleString {
    protected static void sort_SimpleString() {
        String[] array = new String[]{"A", "E", "B", "D", "C"};
        Arrays.sort(array);
        for (String item : array) {
            System.out.println(item);
        }
    }
}
