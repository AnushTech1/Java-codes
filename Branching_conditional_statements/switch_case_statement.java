                    //========Switch case statement========//
//In a switch case statement, different case code blocks can be executed based on
//the multiple results of a condition.

import java.util.*;

public class switch_case_statement {

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. (0 to 7) = ");
        int day = sc.nextInt();

        //Check input is integer

        if (day < 0 || day > 7) {
            System.out.print("Please enter a Integer value in (0 to 7)");
        } else {
            switch (day) {
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Sturday");
                    break;
                case 0:
                    System.out.print("Sunday");
                    break;
            }
        }
        sc.close();
    }
}
