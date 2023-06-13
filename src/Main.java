
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Arrays
        //Arrays in java have fixed size and the size cannot be changed after the initialization
        int[] numbers=new int[5]; //older way of declaring the array
        //initializing array
        numbers[0]=1;
        System.out.println(Arrays.toString(numbers)); //To print the array contents as printing using array name will show address

        int[] number={1,2,5,4}; //declaration without size
        Arrays.sort(number); //A method of array class to sort the array in ascending order
        System.out.println(Arrays.toString(number));
    }
    }