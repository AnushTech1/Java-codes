                        //==========Copy Constructor==========//

public class Copy_constructor {
    String name;
    Copy_constructor(String n) {
        name = n;
    }
    Copy_constructor(Copy_constructor p) {
        name = p.name;
    }
    void display() {
        System.out.print("name : " + name);
    }
    public static void main(String[] args) {
        Copy_constructor p1 = new Copy_constructor("Neha");
        Copy_constructor p2 = new Copy_constructor(p1);
        p2.display();
    }
}
