//Different methods have own scopes.
//with use of curly brace {}.
//and there are some variables so they have local variable.

                    //=======variable scope==========//
public class Method_scope{
    public static void main(String[] args){
        //System.out.println(x);    //this gone be an error because here 'x' not found.

        int x = 100;
        //Here can acces x
        System.out.println(x);
    }
}