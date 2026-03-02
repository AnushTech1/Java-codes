package Operators;

public class Logical_operator {
    public static void main(String[] args) {

        // Logical operators means:- &&(or), ||(and), !(not)

        int x = 5;
        System.out.println(x > 4 && x > 6); // output: false,becouse x > 6 give false
        System.out.println(x > 4 || x > 6); // output: true,becouse x > 4 give true
        System.out.println(!(x > 4 || x > 6));// output: false,becouse (!) true ko false me change ker dega.
    }
}
