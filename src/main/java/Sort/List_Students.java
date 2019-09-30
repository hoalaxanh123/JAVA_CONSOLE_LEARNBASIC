package Sort;

import java.util.ArrayList;
import java.util.List;

public class List_Students {
    public static List<Student> getListStudent() {
        List<Student> lstStudent = new ArrayList<Student>();
        Student st1 = new Student(1, "A", "CTK31");
        Student st2 = new Student(2, "B", "CTK32");
        Student st3 = new Student(3, "C", "CTK33");
        Student st4 = new Student(4, "D", "CTK34");
        Student st5 = new Student(5, "E", "CTK35");
        Student st6 = new Student(6, "F", "CTK36");
        Student st7 = new Student(7, "G", "CTK37");

        lstStudent.add(st1);
        lstStudent.add(st4);
        lstStudent.add(st5);
        lstStudent.add(st3);
        lstStudent.add(st2);
        lstStudent.add(st7);
        lstStudent.add(st6);


        return lstStudent;
    }
}
