package Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

enum Type {
    ID, Name, Class
}

public class Sort_OBJ {
    public static void main(String[] args) {

        String[] array = new String[]{"A1","A12","A10","A102","A2","A21"};
        NaturalOrderComparator NaturalSort = new NaturalOrderComparator();
        Arrays.sort(array, NaturalSort::compare); // OK
        System.out.println("Natural Sort");

        Collections.reverse(Arrays.asList(array));
        for (String item:array){
            System.out.print(item+"->");
        }

        System.out.println("\nDefault Sort");
        Arrays.sort(array); //OK
        for (String item:array){
            System.out.print(item+"->");
        }
//        List<Student> lstStudent = List_Students.getListStudent();
//
//        for (Student student : lstStudent) {
//            System.out.println(student.toString());
//        }
//
//        Collections.sort(lstStudent, (Student1, Student2) -> {
//            return sortStudent(Student1, Student2, Type.Class, 1);
//        });
//
//
//        System.out.println("-------------------Sau sap xep:-------------------");
//        for (Student student : lstStudent) {
//            System.out.println(student.toString());
//        }
//
//        System.out.println(Student.class.getClass());
    }

    public static int sortStudent(Student Student1, Student Student2, Type TypeSort, int Descending) {
        switch (TypeSort) {
            default:
                return -100;
            case ID:
                return (Student1.get_ID() > Student2.get_ID() ? 1 : Student1.get_ID() < Student2.get_ID() ? -1 : 0) * Descending;
            case Name:
                return (Student1.get_Name().compareTo(Student2.get_Name())) * Descending;
            case Class:
                return (Student1.getClass().toString().compareTo(Student2.getClass().toString())) * Descending;
        }
    }

}
