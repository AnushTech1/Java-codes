package String_methods;

public class Special_character {
    public static void main(String[] args) {
        //Java me string ko double quotes me store kerte hai but sometimes(' , ") ka use special
        //name or character ko represent kene ke liey hota hai inka use kerne per error aa sakti
        //hai. to inka use backslash(\) ke sath kerte hai.

        // String text1 = "You know our "INDIA" is seventh biggest country in this world!";
        // this gone be error so we try to \" \" or \' \' or \\ 

        String text1 = "You know our \"INDIA\" is seventh biggest country in this world!";
        String text2 = "You know our \'INDIA\' is seventh biggest country in this world!";
        String text3 = "This is \\ call backslash"; // output only one backslash

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
    
}
