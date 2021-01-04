package q1;


/**
 * <p>Word</p>
 * <p>This program uses the Word class and creates Word objects containing
 * their string and frequency.</p>
 * <p>This program is used with WordCounter and returns strings and changes
 * frequencies. It also contains a method that sorts the words in listOfWord
 * by frequency (compareTo).</p>
 *
 * @author Ivan (Oliver) Harrison
 * @version 2020
 */
public class Word implements Comparable<Word> {
    
    /** <p>Private instance variable for string word.</p> */
    private final String word;
    
    /** <p>Private instance variable for integer frequency.</p> */
    private int frequency;
    
    /**
     * <p>Constructor to set word and frequency.</p>
     * @param input the word the user implements.
     */
    public Word(String input) {
        word = input;
        frequency = 1;
    }

    /**
     * <p>Accessor to get the word variable.</p>
     * @return word
     */
    public String getWord() {
        return word;
    }
    
    /**
     * <p>Accessor to get the frequency variable.</p>
     * @return frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * <p>Method to increment the frequency variable by 1.</p>
     */
    public void incrementFrequency() {
        frequency += 1;
    }
    
    /**
     * <p>Method that sorts the words in listOfWord by frequency.</p>
     * @param input the Word that is being compared.
     * @return integer of the frequency that is higher that is sorted.
     */
    public int compareTo(Word input) {
        return Integer.compare(input.frequency, this.frequency);
    }
    
    /**
     * <p>To string method to return the word and frequency variable.</p>
     * @return word and frequency in a string
     */
    public String toString() {
        return word + "(" + frequency + ")" + " ";
    }
}
