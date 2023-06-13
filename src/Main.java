

public class Main {
    public static void main(String[] args) {
        //Math class
        int n=Math.max(1,2); //Returns the maximum of 1 & 2 to n
        n=Math.min(1,2);  //Returns the minimum of 1&2
        System.out.println(n);
        n=(int)Math.ceil(1.1F); //Explicit conversion to change returned value
        System.out.println(n);
        n=(int)Math.floor(1.9F);
        System.out.println(n);

        //Random function
        double rand=Math.random(); //Returns a floating number from 0-1
        int m=(int) Math.random()*100; //returns 0 as the whole expression is not converted to int
        m=(int)(Math.random()*100); //returns value between 1-100 as integer
        System.out.println(m);
    }
    }