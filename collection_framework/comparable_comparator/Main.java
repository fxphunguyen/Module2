package collection_framework.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Lào", 27, "Hà Tĩnh");
        Student student1 = new Student("Chu", 30, "Hà Tĩnh");
        Student student2 = new Student("Tú", 52, "Hà Tĩnh");
        Student student3 = new Student("Hảo", 47, "Hà Tĩnh");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }
        System.out.println("______________________");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
