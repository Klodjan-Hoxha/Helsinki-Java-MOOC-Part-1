import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 1;
        
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        while (i <= num) {            
            result *= i;
            i++;
        }
        System.out.println("Factorial is " + result);
    }
}
