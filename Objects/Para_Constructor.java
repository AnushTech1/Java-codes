                    //=========Parameterized Constructor=========//
//In the parameterized,constructor we provide a parameter list in the constructor 
//declaration and during the call, we pass an arguments.

public class Para_Constructor {
    int id;
    String name;
    Para_Constructor(int i, String n) {
        id = i;
        name = n;
        System.out.print(id + " " + name);
    }
    public static void main(String[] args) {
        Para_Constructor details = new Para_Constructor(5, "Anush");
    }
}
