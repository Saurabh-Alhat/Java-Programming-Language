import java.util.*;

// Bill of items
public class BillOfItems {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float erasor = sc.nextFloat();

        float total = pencil + pen + erasor;
        System.out.println("Bill is : " + total);


        // Add on with 18% tax
        float finalTotal = total + (0.18f * total);
        System.out.println("Bill with 18% gst : " + finalTotal);
    }
}