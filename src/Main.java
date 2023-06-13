import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Primitive Vs Reference

        //The primitive variables are totally independent of each other.
        int a=10;
        int b=a;
        a=30;
        System.out.println(b); //Value of B does not change!

        //Reference variables point to the location and hence if a variable is assigned to another,they hold the same value

        Point point1=new Point(1,1);
        Point point2=point1; //The same address is assigned to point2 object
        point1.x=5;
        System.out.println(point2); //The value of point2 is coherent with that of point1.
        }
    }