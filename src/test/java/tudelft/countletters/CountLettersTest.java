package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    
    @Test
    public void multipleMatchingRWords() {
        int words = new CountLetters().count("door|car");
        Assertions.assertEquals(2, words);
    }
    
    @Test
    public void multipleMatchingLastDoubleLetter() {
        int words = new CountLetters().count("cox|loss");
        Assertions.assertEquals(2, words);
    }
    
    @Test
    public void multipleMatchingDoubleLetter() {
    	int words = new CountLetters().count("coxx|loss|cipss");
    	Assertions.assertEquals(3, words);
    }

}