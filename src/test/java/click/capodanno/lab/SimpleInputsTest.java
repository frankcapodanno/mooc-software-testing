package click.capodanno.lab;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleInputsTest {
	
	private static final String A_LARGE_EVEN = "A is a large even number";
	private static final String B_LARGE_EVEN = "B is a large even number";
	private static final String A_LARGE_UNEVEN = "A is a large uneven number";
	private static final String B_LARGE_UNEVEN = "B is a large uneven number";
	

	@Test
	void testSimple() {
	     SimpleInputs si = new SimpleInputs();
	     List<String> results = si.simple(21, 104);
	     Assertions.assertTrue(results.contains(A_LARGE_UNEVEN) && results.contains(B_LARGE_EVEN));
	}
	
	@Test
	void testSimple2() {
	     SimpleInputs si = new SimpleInputs();
	     List<String> results = si.simple(22, 103);
	     Assertions.assertTrue(results.contains(A_LARGE_EVEN) && results.contains(B_LARGE_UNEVEN));
	}
	
	@Test
	void testSimpleMinor() {
	     SimpleInputs si = new SimpleInputs();
	     List<String> results = si.simple(10, 99);
	     Assertions.assertTrue(results.size() == 0);
	}

}
