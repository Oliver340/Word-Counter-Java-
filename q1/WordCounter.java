package q1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * <p>WordCounter</p>
 * <p>This program reads all the words for bible.txt and adds them to an
 * array list.</p>
 * <p>The listOfWord array list is used with the Word class and each word
 * in bible.txt creates its own object in Word with a string of the word
 * and integer frequency of the word.</p>
 * <p>
 * <p>It then prints the length of unique words in the list and prints the
 * top ten words by frequency.</p>
 *
 * @author Ivan (Oliver) Harrison
 * @version 2020
 */
public class WordCounter {
    
    /** <p>Private instance variable for array list.</p> */
    private List<Word> listOfWord = new ArrayList<Word>();
    
    /** <p>Private instance variable for the scanner.</p> */
    private Scanner scan;
    
    /**
     * <p>Method to scan the words in bible.txt and add to listOfWord array.</p>
     * @param file the file that is being scanned (bible.txt).
     * @return listOfWord.size() the count for unique words.
     * @throws IOException throw exception.
     */
    public int parseBook(String file) throws IOException {
        scan = new Scanner(new File(file));
        Word word = new Word(scan.next());
        listOfWord.add(word);
        while (scan.hasNext()) {
            word = new Word(scan.next());
            for (int i = 0; i <= listOfWord.size(); i++) {
                if (listOfWord.get(i).getWord().equals(word.getWord())) {
                    listOfWord.get(i).incrementFrequency();
                    break;
                } else if (i == listOfWord.size() - 1) {
                    listOfWord.add(word);
                    break;
                }
            }
        }
        return listOfWord.size();
    }
    
    /**
     * <p>Method that prints the top words of n by frequency in listOfWord.</p>
     * @param n the top n words by frequency.
     */
    public void printTopWords(int n) {
        listOfWord.sort(null);
        for (int i = 0; i < n; i++) {
            System.out.print(listOfWord.get(i));
        }
    }
    
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     * @throws IOException throw exception.
     */
    public static void main(String[] args) throws IOException {
        final int topWords = 10;
        
        WordCounter word = new WordCounter();
        System.out.print("Number of Unique Words: ");
        System.out.println(word.parseBook("src/bible.txt"));
        System.out.print("Top " + topWords +  " Words: ");
        word.printTopWords(topWords);
    }

}
