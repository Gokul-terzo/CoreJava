import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //While loop
        Scanner sc=new Scanner(System.in);
        String input="";
        while(!input.equals("quit")||!input.equals("Quit"))
        {
            System.out.println(input);
            input=sc.next();
            System.out.println("Input is:"+input);
        }
    }
    }