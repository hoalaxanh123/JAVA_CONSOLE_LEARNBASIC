package String;

public class main {
    public static void main(String[] args) {

        //String literal
        String str1 = "Hello world";
        String str2 = "Hello world";

        //Show content and memory address
        System.out.println(str1 + "-" + str2);
        getMemoryAddress(str1);
        getMemoryAddress(str2);

        //Changing the content will change the memory address
        str1 = " Bye now";
        System.out.println(str1 + "-" + str2);
        getMemoryAddress(str1);
        getMemoryAddress(str2);

        //String object
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str3 + "-" + str4);
        getMemoryAddress(str3);
        getMemoryAddress(str4);
    }

    public static void getMemoryAddress(String str) {
        System.out.println(System.identityHashCode(str));
    }
}
