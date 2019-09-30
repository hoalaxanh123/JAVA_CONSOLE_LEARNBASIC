

//abstract class
abstract class DongVat {
    public abstract void showName();
}


class Meo extends DongVat {

    private String Name = "Cat"; // Access modifier - Tính đóng gói, ngoài ra package cũng thể hiện tính đóng gói

    @Override
    public void showName() {
        System.out.println(Name + " is my name");
    }

    public Meo(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        for (Currency cr : Currency.values()) {
            System.out.println(cr);
        }
    }

}