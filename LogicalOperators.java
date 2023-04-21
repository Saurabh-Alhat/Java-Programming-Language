public class LogicalOperators {
    public static void main(String args[]) {
        // Logical AND
        System.out.println("\nLogical AND Operator (&&)");
        System.out.println( (3>2) && (5>0) );
        System.out.println( (3<2) && (5>0) );
        System.out.println( (3>2) && (5<0) );
        System.out.println( (3<2) && (5<0) );

        // Logical OR
        System.out.println("\nLogical OR Operator (||)");
        System.out.println( (3<2) || (5<0) );
        System.out.println( (3>2) || (5<0) );
        System.out.println( (3<2) || (5>0) );
        System.out.println( (3>2) || (5>0) );

        // Logical NOT
        System.out.println("\nLogical NOT Operator (!)");
        System.out.println( !(3>2) );
        System.out.println( !(0>5) );
    }
}