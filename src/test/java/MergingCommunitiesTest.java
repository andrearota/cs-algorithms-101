import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.hackerrank.MergingCommunities;


public class MergingCommunitiesTest {

	@Test
	public void test() {
		MergingCommunities solver = new MergingCommunities(3);
		assertEquals(1, solver.query(1));
		solver.meet(1, 2);
	}

}
