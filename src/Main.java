

public class Main {
    public static void main(String[] args) {
        //Casting

        //Implicit conversion
        int x=3;
        float y=x+1.0F; //java implicitly converts to float
        System.out.println(y);

        //Explicit conversion
        float a=12.3F;
        int b=(int)a+1; //the variable a is converted from float to int
        System.out.println(b);

        //String to number using classes
        String number="1";
        System.out.println(Integer.parseInt(number));
        String number1="1.12";
        System.out.println(Double.parseDouble(number1));
    }
    }