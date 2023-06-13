import java.text.NumberFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Logical Operators
        boolean hasGoodMarks=true;
        boolean hasRelevantSkills=false;
        boolean hasArrear=false;
        boolean canBePlaced= (hasGoodMarks||hasRelevantSkills)&& !hasArrear;
        System.out.println(canBePlaced);
    }
    }