import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //String

        //The classes in java.lang need not be imported
        String name="Gokul"; //Short-hand notation to declare a string object as it is most commonly used class
        System.out.println(name);
        name=name+".S"; //Concatenation of two string using + operator
        System.out.println(name);

        //String methods
        System.out.println(name.replace('.',' ')); //doesn't change the actual string name
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.endsWith("S"));
        name=" Gokul S";
        System.out.println(name.trim()); //removes spaces before and after string
    }
    }