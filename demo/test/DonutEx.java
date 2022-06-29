package demo.test;

import javax.swing.*;
import java.awt.*;

public class DonutEx extends JFrame {
    public DonutEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Donut");
        setSize(370, 320);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                DonutEx ex = new DonutEx();
                ex.setVisible(true);
            }
        });
    }
}
