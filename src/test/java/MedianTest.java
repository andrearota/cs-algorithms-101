import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.hackerrank.MedianFinder;


public class MedianTest {

	@Test
	public void test() {
		
		MedianFinder solver = new MedianFinder();
		
		assertEquals(1.0f, solver.add(1), 0);
		assertEquals(1.5f, solver.add(2), 0);
		assertEquals(2.0f, solver.add(3), 0);

	}

}
