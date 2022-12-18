import java.util.*;

public class InputBasics {
    public static void main(String args[]) {

      Scanner sc = new Scanner(System.in);

      String input = sc.next();
      System.out.println(input);

      String name = sc.nextLine();
      System.out.println(name);

      int number = sc.nextInt();
      System.out.println(number);

      float price = sc.nextFloat();
      System.out.println(price);


      byte b = sc.nextByte();
      System.out.println(b);

      double d = sc.nextDouble();
      System.out.println(d);

      boolean ans = sc.nextBoolean();
      System.out.println(ans);

      short s = sc.nextShort();
      System.out.println(s);

      long l = sc.nextLong();
      System.out.println(l);

    }
}


