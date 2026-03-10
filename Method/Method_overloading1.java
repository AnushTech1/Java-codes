                            //=======Method Overloading=======//
class add {
    int a, b;
    int sum(int x, int y) {
        a = x;
        b = y;
        return value();
    }
    int sum(int c) {
        a = b = c;
        return c;
    }
    int value() {
        return (a + b);
    }
}
public class Method_overloading1 {
    public static void main(String[] args) {
        add s = new add();
        int c = s.sum(50, 50);
            System.out.println("Sum : " + c);
        add s1 = new add();
        c = s1.sum(50);
            System.out.println("Sum : " + c);
    }
}
