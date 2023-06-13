import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Switch statement
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your role:");
        String role=sc.next();
        switch (role)
        {
            case "admin":
                System.out.println("You have the admin privileges");
                break;
            default:
                System.out.println("You are not admin");
                break;
        }
    }
    }