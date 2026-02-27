                        //=======Method Overloading=======//
//hum ek sath multiple method ka use ker sakte hai.
public class Method_overloading {

    //first method
    public static int intMethod(int a, int b) {
        return a + b;
    }
    //second method 
    public static double doubleMethod(double num, double num1) {
        return num + num1;
    }
    //third method
    public static String stringMethod(String str, String str1) {
        return str + " " + str1;
    }
    //Main method that call all method with parameters
    public static void main(String[] args) {
        //first method calling
        System.out.println("Your result was : " + intMethod(10, 20));
        //second method calling
        System.out.println("Your output is : " + doubleMethod(2.49, 3.35));
        //third method calling
        System.out.println("your name is : " + stringMethod("Anush", "bhise"));

    }
}
