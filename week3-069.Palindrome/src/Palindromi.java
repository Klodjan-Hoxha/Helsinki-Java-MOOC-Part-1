import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String reversedText = "";
        int len = text.length() - 1;
        char result;
        
        while (len >= 0) {            
            result = text.charAt(len);
            len--;
            reversedText += result;
        }
        
        if (reversedText.equals(text)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
