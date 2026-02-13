
import java.util.*;

public class BankManagement {


    public static void main(String args[]) {
        System.out.println("Choose an option(1-3) : ");
        System.out.println();
        System.out.println("1. Create Account : ");
        System.out.println("2. Login Your Account : ");
        System.out.println("3. Exit : ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        /*check input is under 1 to 3*/
        if (option >= 3 && option <= 1) {
            System.out.println("Please Enter option no. (1 to 3)");
        } else {
            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter your name : ");
                    String AcName = sc.nextLine();
                    System.out.println("Enter your Password : ");
                    String AcPass = sc.nextLine();
                    System.out.println("Enter your Account opening Amount : ");
                    Float Amount = sc.nextFloat();
                    
                    break;
                case 2:
                    System.out.println("Thios ");
                    break;
            }
        }
        
    }
}
