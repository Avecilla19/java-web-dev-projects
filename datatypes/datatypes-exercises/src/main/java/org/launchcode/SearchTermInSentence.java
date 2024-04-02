package org.launchcode;
import java.util.Scanner;

public class SearchTermInSentence {
    public static void main(String[] args){
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a term to search for: ");
        String searchTerm = scanner.nextLine();
        boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());
        if (found) {
            int index = aliceSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            int length = searchTerm.length();

            System.out.println("Index of the word: " + index);
            System.out.println("Length of the word: " + length);
            //substring() method removes the word from the sentence
            String updatedAliceSentence = aliceSentence.substring(0, index) + aliceSentence.substring(index + length);
            System.out.println("Removal updated string: " + updatedAliceSentence);
        }

       // System.out.println("Search term found: " + found);
        scanner.close();
    }
}
