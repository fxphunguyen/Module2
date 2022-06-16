package mang;

public class Noi_Mang {
    public static String encodeString(String str) {
        String result;
        char charCurrent = str.charAt(0);
        result = String.valueOf(charCurrent);
        int countCurrent = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (charCurrent != character) {
                result += String.valueOf(countCurrent);
                result += String.valueOf(character);
                charCurrent = character;
                countCurrent = 1;
            } else
                countCurrent++;

        }
        return result+countCurrent;
    }

    public static void main(String[] args) {
        System.out.println(encodeString("aaabcccaazzzcc"));

    }

}
