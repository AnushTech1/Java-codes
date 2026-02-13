                        //======if Statement======//
//In the if statement, we give a condition.
//If condition is true , then the code block is executed.
import java.util.*;

public class if_statement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your no. = ");
        int a = sc.nextInt();
        if(a >= 10){
            System.out.print(a+" is greater then 10");
        }
        sc.close();
    }
}