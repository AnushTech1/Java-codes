                        //==========Ternary Operator==========//
package Loop_iteration_statements;

public class ternary_operator {
    public static void main(String[] args){
        //hum if..else statement ko short ker sakte hai.
        //Uske sthan per ternary operator ka use ker.
        //Syntax:-  variable = (condition)? statement1 : statement2;
        
        int x = 2,
            y = 3;
        String result = (x == y)? "X or Y is Equal" : "X or Y is not Equal";
        System.out.println(result);
    }
    
}
