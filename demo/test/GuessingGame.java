package demo.test;

import javax.swing.*;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 );
        int userAnswer = 0;
        System.out.println("Đáp án chính xác là: " + computerNumber);
        int count = 1;

        while (userAnswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null,
                    "Nhập dự đoán từ 1 đến 100", "Guessing Game", JOptionPane.QUESTION_MESSAGE);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
            count++;
        }
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "Dự đoán của bạn không hợp lệ";
        } else if (userAnswer == computerNumber) {
            return "Chuẩn luôn! \n Số lần đoán: " + count;
        } else if (userAnswer > computerNumber) {
            return "Dự đoán của bạn cao hơn so với kết quả. \n Số lần đoán: " + count;
        } else {
            return "Dự đoán của bạn thấp hơn so với kết quả. \n Số lần đoán: " + count;
        }

    }
}

