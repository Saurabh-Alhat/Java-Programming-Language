import java.util.*;

public class TypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // float a = 25.9999f;
        // int b = (int) a;
        // System.out.println(b);

        // float marks = 99.999f;
        // int marks2 = (int) marks;
        // System.out.println(marks2);

        // float number = 99.99f;
        // int number2 = (int) number;
        // System.out.println(number2);

        char ch = 'a';
        char ch1 = 'b';            // 'c' = 99, 'd' = 100, 'e' = 101, ..... 'z' = 122 
        int num = ch;
        int num1 = ch1;
        System.out.println(num);
        System.out.println(num1);
    }

}
