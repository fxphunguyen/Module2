package stream_text;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputExample {
    public static void main(String[] args) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream("D:\\Module2\\stream_text\\mydata.bin");
            DataInputStream dis = new DataInputStream(fis);
            //Bước 2: Đọc dữ liệu
            int n = dis.readInt();
            double m = dis.readDouble();
        //    char c = dis.readChar();
        //    boolean t = dis.readBoolean();
            //Bước 3: Đóng luồng
            fis.close();
            dis.close();
            //Hiển thị nội dung đọc từ file
            System.out.println("Số nguyên: " + n);
            System.out.println("Số thực: " + m);
        //    System.out.println("chuoi: " + c);
        //    System.out.println("boolean: " + t);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
