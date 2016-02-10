import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.andrearota.general.GraphChecker;
import com.andrearota.general.SimpleNode;

public class GraphCeckerTest {

	@Test
	public void testBST() {

		// 			10
		// 		4 		11
		// 	2
		//
		SimpleNode s = new SimpleNode(10);
		SimpleNode n0 = new SimpleNode(4);
		SimpleNode n1 = new SimpleNode(2);
		SimpleNode n2 = new SimpleNode(11);

		s.children.add(n0);
		s.children.add(n2);
		n0.children.add(n1);

		assertEquals(true, GraphChecker.verifyBST(s));
	}
	
	@Test
	public void testNoBST_ThreeChildren() {

		// 			10
		// 		4 	3	11
		// 	2
		//
		SimpleNode s = new SimpleNode(10);
		SimpleNode n0 = new SimpleNode(4);
		SimpleNode n1 = new SimpleNode(2);
		SimpleNode n2 = new SimpleNode(11);
		SimpleNode n3 = new SimpleNode(3);

		s.children.add(n0);
		s.children.add(n2);
		s.children.add(n3);
		n0.children.add(n1);

		assertEquals(false, GraphChecker.verifyBST(s));
	}
	
	@Test
	public void testNoBST_NoOrder() {

		// 			10
		// 		4 		2
		// 	11
		//
		SimpleNode s = new SimpleNode(10);
		SimpleNode n0 = new SimpleNode(4);
		SimpleNode n1 = new SimpleNode(2);
		SimpleNode n2 = new SimpleNode(11);

		s.children.add(n0);
		s.children.add(n1);
		n0.children.add(n2);

		assertEquals(false, GraphChecker.verifyBST(s));
	}
	
	@Test
	public void testNoBST_Cycle() {

		// 			10
		// 		4 		2
		// 	11
		//	2
		SimpleNode s = new SimpleNode(10);
		SimpleNode n0 = new SimpleNode(4);
		SimpleNode n1 = new SimpleNode(2);
		SimpleNode n2 = new SimpleNode(11);

		s.children.add(n0);
		s.children.add(n1);
		n0.children.add(n2);
		n2.children.add(n1);

		assertEquals(false, GraphChecker.verifyBST(s));
	}
	
	@Test
	public void toLinkedList() {
		//			10
		// 		4 		11
		// 	2
		//
		SimpleNode s = new SimpleNode(10);
		SimpleNode n0 = new SimpleNode(4);
		SimpleNode n1 = new SimpleNode(2);
		SimpleNode n2 = new SimpleNode(11);
	
		s.children.add(n0);
		s.children.add(n2);
		n0.children.add(n1);
		
		List<Integer> result = new LinkedList<Integer>();
		GraphChecker.toList(result, s);
		
		int[] arr = new int[result.size()];
		int i = 0;
		
		for (Integer v : result) {
			arr[i] = v;
			i++;
		}
		
		int[] expected = {2, 4, 10, 11};
		assertArrayEquals(expected, arr);
		
	}

}
