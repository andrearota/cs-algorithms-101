import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.JessieCookies;


public class JessieCookieTest {

	@Test
	public void testOne() {
		int[] cookies = {1, 2, 3, 9, 10, 12};
		JessieCookies solver = new JessieCookies(7);
		
		for(int c: cookies) {
			solver.add(c);
		}
		
		int result = solver.solve();
		
		assertEquals(2, result);
	}
	
	//13 47 74 12 89 74 18 38

	@Test
	public void testTwo() {
		int[] cookies = {13, 47, 74, 12, 89, 74, 18, 38};
		JessieCookies solver = new JessieCookies(90);
		
		for(int c: cookies) {
			solver.add(c);
		}
		
		int result = solver.solve();
		
		assertEquals(5, result);
	}
	
}
