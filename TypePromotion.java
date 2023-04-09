import java.util.*;

public class TypePromotion {
    public static void main(String args[]){
        //Rule I: byte, short or char ---> promoted to int.

        //Example 1
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(b)); //98
        // System.out.println((int)(a)); //97
        // System.out.println(b-a);      //1  //Type Promotion only happens with expressions.
        // System.out.println(a);        //a  // Java won't promote variable 'a'. 
        // char c = a - b;               //lossy conversion from int to char.

        //Example 2
        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // // byte bt = a + b + c;          // lossy conversion from int to byte.
        // byte bt = (byte) (a + b + c);    //-127: does'nt have any sense but ans exist.
        // System.out.println(bt);


        //Rule II: one operand is long, float or double ---> expression promoted to long, float or double.

        // Example
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;         // 85.25     
        // System.out.println(ans);
        // // int ans = a + b + c + d;         // lossy conversion from double to int.     


        // Type Promotion another example

        byte b = 5;
        // byte a = b * 2;                        // lossy conversion from int to byte.
        byte a = (byte) (b * 2);               // 10
        System.out.println(a);                
    }
}