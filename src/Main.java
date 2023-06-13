import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        //Number formatting

        //Currency
        NumberFormat currency=NumberFormat.getCurrencyInstance(); //cannot use new as it is a abstract class
        String result=currency.format(30000);
        System.out.println(result);
        System.out.println(NumberFormat.getCurrencyInstance().format(100000)); //method chaining

        //Percentage
        System.out.println(NumberFormat.getPercentInstance().format(0.01));
    }
    }