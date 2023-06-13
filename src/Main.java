

public class Main {
    public static void main(String[] args) {
        //Order of Operations

        //Precedence: ()>*/>+-
        int a= 8+2*10;
        System.out.println(a); //result is 28 as * is executed first

        //It can be manipulated using ()
        a=(8+2)*10;
        System.out.println(a); //result is 100
    }
    }