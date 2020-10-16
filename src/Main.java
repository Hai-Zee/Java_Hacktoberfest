import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        
//         this program is to generate the random number.
        
        int[] numbers = new int[]{5,4,8,9,6,3,7,4,2,85,63,45,10};
        Random randomNum = new Random();
        int num = randomNum.nextInt(numbers.length);
        
        System.out.println(numbers[num]);
        
    }
}
