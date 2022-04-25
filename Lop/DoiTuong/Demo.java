package Lop.DoiTuong;

public class Demo {
    int id;
    String name;
    static String college = "Đại học";

    static void change() {
        college = "CodeGym";
    }

    Demo(int i, String n) {
        id = 1;
        name = n;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Demo.change();

        Demo s1 = new Demo(111, "Vinh");
        Demo s2 = new Demo(222, "Tiến");
        s1.display();
        s2.display();

    }
}

