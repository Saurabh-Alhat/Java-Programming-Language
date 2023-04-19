public class RelationalOperators {
    public static void main (String args[]) {
        int A = 10;
        int B = 10;
        int C = 5;
        // Equal to Operator (==)
        System.out.println("\nEqual to Operator");
        System.out.println((A == B));
        System.out.println((A == C));

        // Not Equal to Operator (Inequality) (!=)
        System.out.println("\nNot Equal to Operator");
        System.out.println((A != C));
        System.out.println((A != B));

        // Greater than Operator (>)
        System.out.println("\nGreater than Operator");
        System.out.println((B > C));
        System.out.println((C > B));

        // Less than Operator (<)
        System.out.println("\nLess than Operator");
        System.out.println((C < B));
        System.out.println((B < C));

        // Greater than or equal to Operator (>=)
        System.out.println("\nGreater than or equal to Operator");
        System.out.println((A >= B));
        
        // Less than or equal to Operator (<=)
        System.out.println("\nLess than or equal to Operator");
        System.out.println((A <= B));
    }
}