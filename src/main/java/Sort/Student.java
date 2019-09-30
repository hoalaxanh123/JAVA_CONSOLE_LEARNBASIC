package Sort;

public class Student {
    private int _ID;
    private String _Name;
    private String _Class;

    public Student(int _ID, String _Name, String _Class) {
        this._ID = _ID;
        this._Name = _Name;
        this._Class = _Class;
    }

    public Student() {
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_Class() {
        return _Class;
    }

    public void set_Class(String _Class) {
        this._Class = _Class;
    }

    @Override
    public String toString() {
        String result = String.format("ID: %s, Name: %s, Class: %s", this._ID, this._Name, this._Class);
        return result;
    }
}
