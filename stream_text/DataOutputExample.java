package stream_text;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Module2\\stream_text\\mydata.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(100);
            dos.writeDouble(9.5);
            dos.writeChars("hahaha,j,k");
            dos.writeBoolean(true);

            fos.close();
            dos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
