package demo.test;

import java.io.FileOutputStream;

public class Try_With {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("/message1.txt")) {
            String msg = "Welcome to VietTuts.Vn!";
            // converting string thanh mang byte
            byte byteArray[] = msg.getBytes();
            fos.write(byteArray);
            System.out.println("Thong diep da duoc ghi vao file thanh cong!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}



