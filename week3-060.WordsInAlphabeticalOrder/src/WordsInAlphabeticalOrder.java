
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {            
            
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            
            if (!(word.isEmpty())) {
                words.add(word);
            } else {
                System.out.println("You typed the following words: ");
                
                Collections.sort(words);
                
                for (String text : words) {
                    System.out.println(text);
                }
                
                break;
            }
        }
    }
}
