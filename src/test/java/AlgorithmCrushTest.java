import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.andrearota.general.AlgorithmCrushSolver;
import com.andrearota.general.Pair;


public class AlgorithmCrushTest {

	@Test
	public void test() {
		final int n = 10;
		final int m = 2;
		
		AlgorithmCrushSolver solver = new AlgorithmCrushSolver(n, m);
		
		solver.add(1, 2, 100);
		solver.add(2, 3, 100);
		
		long result = solver.solve();
		assertEquals(200L, result);
		
	}
	
	@Test
	public void testPair() {
		List<Pair> list = new ArrayList<Pair>();
		list.add(new Pair(4, 2));
		list.add(new Pair(2, 5));
		list.add(new Pair(2, 2));
		
		Collections.sort(list);
		
		System.out.println(Arrays.toString(list.toArray()));
		
	}
	

}
