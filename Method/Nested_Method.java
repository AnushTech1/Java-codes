                            //=======Nested Method=======//
class nesting {
    int m,n;
    nesting(int x, int y){
        m = x;
        n = y;
    }
    int largest(){ 
    if(m >= n)
    {return m;}         
    else
    {return n;}
}  
void display(){
    int larg = largest();
    System.out.println(larg);
} 
}
   public class Nested_Method{
        public static void main(String[] args) {
            nesting obj = new nesting(50,40);
            obj.display();
        }
    }
    
