import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.TwoStringSolution;


public class TwoStrings {

	@Test
	public void testPositiveCase() {
		
		String a = "I love foo bar bar foo";
		String b = "He went to the bar";
		
		boolean result = TwoStringSolution.seachCommonSubstrings(a, b);
		
		assertEquals(true, result);
	}

	@Test
	public void testNegativeCase() {
		
		String a = "Hello";
		String b = "Baby";
		
		boolean result = TwoStringSolution.seachCommonSubstrings(a, b);
		
		assertEquals(false, result);
	}
	
}
