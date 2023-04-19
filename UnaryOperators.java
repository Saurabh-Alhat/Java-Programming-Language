public class UnaryOperators {
    public static void main(String args[]) {
        // Pre Increment
        int a = 10;
        int b = ++a;
        System.out.println("\nPre Increment");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Post Increment
        int c = 10;
        int d = c++;
        System.out.println("\nPost Increment");
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Pre Decrement
        int e = 10;
        int f = --e;
        System.out.println("\nPre Decrement");
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // Post Decrement
        int g = 10;
        int h = g--;
        System.out.println("\nPost Decrement");
        System.out.println("g = " + g);
        System.out.println("h = " + h); 
    }
}