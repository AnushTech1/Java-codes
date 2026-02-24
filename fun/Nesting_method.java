                        //=======Nesting method=======//
public class Nesting_method {
    int i;
    String n;
    Nesting_method(int id, String name) {
        i = id;
        n = name;
    }
    void display() {
        System.out.print(i + " " + n);
    }
    public static void main(String[] args) {
        Nesting_method obj = new Nesting_method(1, "hello");
        obj.display();
    }
}