import java.util.*;
public class std_grade{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Marks = ");
	int g = sc.nextInt();
if(g>=95){
	System.out.print("EXCELLENT");
}
  else if(g>=90){
	System.out.print("FIRST");
}
  else if(g>=70){
	System.out.print("SECOND");
}
  else if(g>=45){
	System.out.print("THIRD");
}
  else if(g>=33){
	System.out.print("PASS");
}

else{
	System.out.print("FAIL");
}
}
}