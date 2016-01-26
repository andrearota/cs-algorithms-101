import org.junit.Test;

import com.andrearota.general.SparseArraySolver;


public class SparseArrayTest {

	
	
	@Test
	public void test() {
		String[] strings = {"aba", "baba", "aba", "xzxb"};
		String[] queries = {"aba", "xzxb", "ab"};
		
		SparseArraySolver solver = new SparseArraySolver();
		for(String s: strings) {
			solver.addString(s);
		}
		
		for(String q: queries) {
			System.out.println(solver.findOccurences(q));
		}
		
	}

}
