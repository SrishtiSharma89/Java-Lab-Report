package DatatypesVariableAndOperators;

public class RelationalLogicalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x is equal to y: " + (x == y));
        System.out.println("x is less than y: " + (x < y));
        System.out.println("x is greater than y: " + (x > y));
        System.out.println("x is less than and equal to y: " + (x <= y));
        System.out.println("x is greater than and equal to y: " + (x >= y));
        System.out.println("Logical AND (x < y && x > 5): " + (x < y && x > 5));
        System.out.println("Logical OR (x > y || x < 5): " + (x > y || x < 5));
        System.out.println("Logical NOT (x!=y): " + (x!=y));
    }
}
