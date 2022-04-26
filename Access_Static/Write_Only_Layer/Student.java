package Access_Static.Write_Only_Layer;

public class Student {
    private String name = "John";
    private String clas = "C02";

    Student() {

    }

    public String setName(String name) {
        return this.name = name;
    }

    public void setClassed(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clas='" + clas + '\'' +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Thinh");
        student.setClassed("C03");
        System.out.println(student);
    }
}
