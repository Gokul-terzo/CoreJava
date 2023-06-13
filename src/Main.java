
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Multi-dimensional arrays

        //2D arrays
        int [][] two_d=new int[2][3]; //declaration with size
        int[][] two_d1={{1,2,3},{4,5,6}}; //declaration with values
        System.out.println(Arrays.deepToString(two_d)); //to convert a multi-dimensional array to printable string
        System.out.println(Arrays.deepToString(two_d1));

        //3D arrays
        int [][][] three_d=new int[1][2][3];
        System.out.println(Arrays.deepToString(three_d));

        //Constants
        final float g=9.81F; //To declare this variable as a constant i.e its value cannot be changed in further code.

    }
    }