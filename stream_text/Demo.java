package stream_text;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    private final static String file = "D:\\Module2\\stream_text\\fx.csv";
    public static void main(String[] args) throws IOException {

        File x = new File(file);

        System.out.println("Tên file: " + x.getName()); // Lấy tên file
        System.out.println( x.getParent());  // lấy đường dẫn thư mục của file
        System.out.println( x.getPath());  // đường dẫn đầy đủ
        System.out.println( x.isDirectory()); //  kiểm tra xem là thư mục hay không
        System.out.println( x.isFile());  //  kiểm tra xem có phải là file hay không
        System.out.println( x.length());  // lấy kích cỡ file bằng byte
        System.out.println(Arrays.toString(x.list())); // lấy tên các file có trong thư mục
       // x.renameTo(new File("stream_text"));  // đổi tên file


        if(x.exists()) {
            System.out.println(x.getName() + " " +  "exists!");
        }
        else {
            System.out.println("File không tồn tại");
        }
    }
}
