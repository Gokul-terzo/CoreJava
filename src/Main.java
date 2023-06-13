import java.net.ServerSocket;
import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Mortgage calculator
        Scanner sc=new Scanner(System.in);
        System.out.print("Principal:");
        long principal=sc.nextLong();
        System.out.print("\nAnnual rate of interest:");
        float rate=sc.nextFloat();
        rate/=100;
        rate/=12;
        System.out.print("\nNumber of years:");
        int year=sc.nextByte();
        year*=12;
        double mortgage=principal*((rate*Math.pow((1+rate),year))/(Math.pow((1+rate),year)-1));
        System.out.print("Mortgage:"+NumberFormat.getCurrencyInstance().format(mortgage));
    }
    }