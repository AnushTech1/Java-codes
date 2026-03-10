                    //=========Methods With Different Modifiers=========//
class ClassA {
    void show() {
        System.out.println("This is normal void MethodsWithModifiers!");
    }
    int show1() {
        System.out.println("This is normal int MethodsWithModifiers! with return statement");
        return 0;
    }
    public void show2(int a, int b) {
        int c = a + b;
        System.out.println("This is public parameter void type MethodsWithModifiers" + c);
    }
    public int show3() {
        System.out.println("This is public int MethodsWithModifiers! with return statement");
        return 0;
    }
    static void show4() {
        System.out.println("This is static void MethodsWithModifiers!");
    }
    static int show5() {
        System.out.println("This is static int MethodsWithModifiers! with return statement");
        return 0;
    }
}
public class MethodsWithModifiers {
    public static int show7() {
        System.out.println("This is public static int Method! with return statement");
        return 0;
    }
    static void show6() {
        System.out.println("This is public static void MethodsWithModifiers!");
    }
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.show();
        obj.show1();
        obj.show2(4, 5);
        obj.show3();
        ClassA.show4();
        ClassA.show5();
        MethodsWithModifiers.show6();
        MethodsWithModifiers.show7();
    }
}
