                    //======else-if Statement======//
//In an else-if statement, we can give two or more conditions.
//If one condition is true then its code block is executed.
import java.util.*;

public class else_if_Statement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Grade : ");
        int grade = sc.nextInt();
        if(grade >= 95){
            System.out.print("Excellent");
        }
        else if(grade >= 80){
            System.out.print("First grade");
        }
        else if(grade >= 75){
            System.out.print("Second grade");
        }
        else if(grade >= 55){
            System.out.print("Third grade");
        }
        else if(grade >= 33){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
        sc.close();
    }
}