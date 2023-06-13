

public class Main {
    public static void main(String[] args) {
        //Arithmetic expressions
        int a=2+3;
        System.out.println(a);

        //Explicit type conversion in expressions
        float div=(float)10/3;
        System.out.println(div);

        //Increment or decrement
        int b=3;
        int c=b++; //gets assigned before increment
        int d=++b; //gets incremented before assignment
        System.out.println(c);
        System.out.println(d);
        //Augmented assignment
        int x=2;
        x=x+2; //normal assignment
        x+=2; //augmented assignment
        System.out.println(x);
    }
    }