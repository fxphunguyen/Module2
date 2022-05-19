package stream_text;

import java.io.File;

public class Demo {
    private final static String file = "D:\\Module2\\stream_text";
    public static void main(String[] args) {

        File x = new File(file);

        System.out.println("Tên file: " + x.getName());
        System.out.println("Thư mục: " + x.getParent());
        System.out.println("Thư mục: " + x.getPath());


        if(x.exists()) {
            System.out.println(x.getName() +  "exists!");
        }
        else {
            System.out.println("File không tồn tại");
        }
    }
}
