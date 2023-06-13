import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //If statement
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter today's temperature:");
        int temp=sc.nextInt();
        if(temp>30)
            System.out.println("It is a hot day\nDrink a lot of water");
        else if(temp>=20&&temp<=30)
            System.out.println("It is a nice day");
        else
            System.out.println("It is cold");
    }
    }