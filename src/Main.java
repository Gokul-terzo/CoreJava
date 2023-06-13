import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Do-While loop
        Scanner sc=new Scanner(System.in);
        String input="";
        do{
            System.out.println("Enter the input");
            input=sc.next();
            System.out.println("Input is:"+input);
        }while(!input.equals("quit")&&!input.equals("Quit"));
    }
    }