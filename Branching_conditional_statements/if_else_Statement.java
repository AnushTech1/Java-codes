                        //======If-else Statement======//
//In the if-else statement, we give a condition.
//If condition was true then first code block is executed.
//If condition was false then else code block is executed.
import java.util.*;

public class if_else_Statement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age");
        int age = sc.nextInt();

        //Check input 
        if(age>=18){
            System.out.print("You are eligible to Vote!");
        }
        else{
            System.out.print("You are not eligible to Vote!");
        }
        sc.close();
    }
}