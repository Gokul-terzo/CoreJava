import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Fizz Buzz
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        if(number%5==0)
        {
            if(number%3==0)
                System.out.println("Fizz Buzz");
            else
                System.out.println("Fizz");
        }
        else if(number%3==0)
        {
            System.out.println("Buzz");
        }
        else
            System.out.println(number);
    }
    }