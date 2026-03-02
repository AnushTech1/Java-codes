package Operators;

public class Assignment_operator {
 public static void main(String[] args){

    // Assignment operator means :-  =, +=, -=, *=, /=

    int num1 = 3;
    int num2 = num1 += 3;
    int num3 = num1 -= 3;
    int num4 = num1 *= 3;
    int num5 = num1 /= 3;

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
 }   
}
