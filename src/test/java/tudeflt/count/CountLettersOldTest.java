package tudeflt.count;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tudelft.count.CountLettersOld;


class CountLettersOldTest {

	   @Test
	    public void multipleMatchingWords() {
	        int words = new CountLettersOld().count("cats|dogs");
	        Assertions.assertEquals(2, words);
	    }

	    @Test
	    public void lastWordDoesNotMatch() {
	        int words = new CountLettersOld().count("cats|dog");
	        Assertions.assertEquals(1, words);
	    }
	    
	    @Test
	    public void multipleMatchingRWords() {
	        int words = new CountLettersOld().count("door|car");
	        Assertions.assertEquals(2, words);
	    }
	    
	    @Test
	    public void multipleMatchingrsWords() {
	        int words = new CountLettersOld().count("door|cas|");
	        Assertions.assertEquals(2, words);
	    }

}
