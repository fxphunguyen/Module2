package Access_Static;

public class Student {
    int id;
    String name;
    static String college = "Đại học";


    static void change() {
        college = "CodeGym";
    }

    Student(int i, String n) {
        id = 1;
        name = n;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Student.change();

        Student s1 = new Student(111, "Vinh");
        Student s2 = new Student(222, "Tiến");
        s1.display();
        s2.display();

    }
}

