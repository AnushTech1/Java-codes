public class NestedClass {
    public class inside {
        String name;
        int id;
        inside(String n, int i) {
            name = n;
            id = i;
        }
        void show() {
            System.out.println("hello " + name + " and your id is " + id);
        }
    }
    public static void main(String[] args) {
        NestedClass outer = new NestedClass();
        NestedClass.inside inner = outer.new inside("Rahul", 2);
        inner.show();
    }
}
