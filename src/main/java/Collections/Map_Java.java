package Collections;

import java.util.HashMap;

public class Map_Java {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "DaLat");
        hashMap.put(2, "HoChiMinh");
        hashMap.put(3, "HaNoi");

        hashMap.forEach((key, val) -> {
            System.out.println(key + ": " + val);
        });

        HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
        hashMap2.put(1, "DaLat");

        System.out.println(hashMap.equals(hashMap2));
    }
}
