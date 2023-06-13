import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Mortgage calculator final
        Scanner sc=new Scanner(System.in);
        System.out.print("Principal(1K - 10L):");
        long principal=sc.nextLong();
        while(principal<1000||principal>1000000)
        {
            System.out.println("Principal must be in between 1K and 10L");
            System.out.print("Principal(1K - 10L):");
            principal=sc.nextLong();
        }
        System.out.print("\nAnnual rate of interest:");
        float rate=sc.nextFloat();
        while(rate<=0||rate>30)
        {
            System.out.println("Rate must be greater than 0 and lesser than or equal to 30");
            System.out.print("\nAnnual rate of interest:");
            rate=sc.nextFloat();
        }
        rate/=100;
        rate/=12;
        System.out.print("\nNumber of years:");
        int year=sc.nextByte();
        year*=12;
        while(year<1||year>30)
        {
            System.out.println("Year must be greater than 0 and lesser than or equal to 30");
            System.out.print("\nNumber of years:");
            year=sc.nextByte();
        }
        double mortgage=principal*((rate*Math.pow((1+rate),year))/(Math.pow((1+rate),year)-1));
        System.out.print("Mortgage:"+NumberFormat.getCurrencyInstance().format(mortgage));
    }
    }