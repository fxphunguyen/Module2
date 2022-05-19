package sap_xep;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        Student Vinh = new Student(6321, "Vinh Huynh", 24, "An Hoa");
        Student Bui = new Student(2130, "Vinh Bui", 23, "Phu Bai");
        Student Tai = new Student(1331, "Thien Tai", 25, "Gia Hoi");
        Student Phu = new Student(45432, "Tieu Phu", 25, "Huong Son");

//        Arrays.sort(students);
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(Arrays.toString(students));
//        }



    }

    public void sortSelection(int[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int min_indx = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j] < students[min_indx])
                    min_indx = j;

                int temp = students[min_indx];
                students[min_indx] = students[i];
                students[i] = temp;
            }
        }
    }
}
