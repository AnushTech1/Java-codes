                //=====Nested if-else Statement=====//
//In a nested `if`, there is an outer `if`, and it can have one or more inner `if` statements.
public class nested_if_else{
    public static void main(String[] args) {
        int age = 20;
        int marks = 85;

        // Outer if condition
        if (age >= 18) {
            System.out.println("You are eligible.");

            // Inner if conditions
            if (marks >= 80) {
                System.out.println("You got excellent marks!");
            } 
            if (marks >= 60 && marks < 80) {
                System.out.println("You passed with good marks.");
            }
        } else {
            System.out.println("You are not eligible.");
        }
    }
}

    