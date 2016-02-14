import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.hackerrank.CommunityMerger;

public class CommunityMergerTest {

	@org.junit.Test
	public void test() {

		CommunityMerger solver = new CommunityMerger(3);

		assertEquals(1, solver.query(1));
		solver.merge(1, 2);
		assertEquals(2, solver.query(2));
		solver.merge(2, 3);
		assertEquals(3, solver.query(3));
		assertEquals(3, solver.query(2));

	}

}
