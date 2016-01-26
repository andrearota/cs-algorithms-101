import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.StreamingCounter;

public class StreamingCounterTest {

	@Test
	public void testCounter() {

		int[] input = { 10000, 28888, 455, -890, 1000000, 1000232, 12342123,
				109, -10965 };
		int expected = 12342123;
		
		StreamingCounter counter = new StreamingCounter(4);
		
		for(int i: input) {
			counter.submit(i);
		}
		
		assertEquals(expected, counter.getMaxValue());
		
	}

}
