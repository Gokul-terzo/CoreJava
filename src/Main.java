import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Reading input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        byte age=sc.nextByte();
        System.out.println("Your age is"+age);
        System.out.println("Enter your full name");
        String fullName=sc.nextLine(); //To accept spaces
        System.out.println(fullName.trim());
    }
    }