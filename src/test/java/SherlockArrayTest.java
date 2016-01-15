import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.hackerrank.SherlockAndArraySolver;


public class SherlockArrayTest {

	@Test
	public void test() {
		
		SherlockAndArraySolver solver = new SherlockAndArraySolver();
		
		int input[] = {1, 2, 3, 4, 10};
		boolean expected = true;
		
		assertEquals(expected, solver.solve(input));
		
	}

}
