package stack_queue.swap_stack;

import java.util.Stack;

public class Main {
    public static void reverse(StringBuffer str) {
        int n = str.length();
        Stack obj = new Stack();

        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        for (i = 0; i < n; i++)
        {
            char ch = (char) obj.pop();
            str.setCharAt(i,ch);
        }

    }

    public static void main(String args[])
    {
        //create a new string
        StringBuffer s= new StringBuffer("CodeGym.vn");

        //call reverse method
        reverse(s);

        //print the reversed string
        System.out.println("Reversed string is: " + s);
    }
}
