import static org.junit.Assert.*;

import org.junit.Test;


public class StringFinderTest {

	@Test
	public void testFindStringPositive() {
		String string = "Hello babe this in me";
		String substring = "his";
		
		assertEquals(12, StringUtils.find(substring, string));
	}
	
	@Test
	public void testFindStringNegative() {
		String string = "Hello babe this in me";
		String substring = "her";
		
		assertEquals(-1, StringUtils.find(substring, string));
	}

}
