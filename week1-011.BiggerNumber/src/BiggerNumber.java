
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        int num1, num2;
        
        System.out.println("Type a number: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        num2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("The bigger number of the two numbers given was: " + Math.max(num1, num2));
    }
}
