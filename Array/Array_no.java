public class Array_no{
    public static void main(String[] args){
        //int type array
        int table2[] ={2,4,6,8,10,12,14,16,18,20};
        //Print array element with simple method
        System.out.println("Array element are:" + table2[1]);
        //output: 4
        System.out.println();
        //Print array element with for loop
        for(int i = 0; i < table2.length; i++){
            System.out.println("Array element are:" + table2[i]);
        }
    }
}