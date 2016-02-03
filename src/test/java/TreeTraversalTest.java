import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.andrearota.datastructure.tree.BFSIterativeStrategy;
import com.andrearota.datastructure.tree.BFSRecursiveStrategy;
import com.andrearota.datastructure.tree.DFSPostorderIterativeStrategy;
import com.andrearota.datastructure.tree.DFSPostorderRecursiveStrategy;
import com.andrearota.datastructure.tree.DFSPreorderIterativeStrategy;
import com.andrearota.datastructure.tree.DFSPreorderRecursiveStrategy;
import com.andrearota.datastructure.tree.TreeNode;
import com.andrearota.datastructure.tree.VisitStrategy;


public class TreeTraversalTest {
	
	public TreeNode createTestTree() {
		
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		
		a.getChildren().add(b);
		a.getChildren().add(c);
		
		b.getChildren().add(d);
		d.getChildren().add(e);
		
		return a;
		
	}

	@Test
	public void testDFSPreorderRecursiveVisit() {
		TreeNode root = createTestTree();
		VisitStrategy strategy = new DFSPreorderRecursiveStrategy();
		
		int[] result = strategy.visit(root);
		int[] expected = {1, 2, 4, 5, 3};
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testDFSPostOrderRecursiveVisit() {
		TreeNode root = createTestTree();
		VisitStrategy strategy = new DFSPostorderRecursiveStrategy();
		
		int[] result = strategy.visit(root);
		int[] expected = {5, 4, 2, 3, 1};
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testDFSPreorderIterativeVisit() {
		TreeNode root = createTestTree();
		VisitStrategy strategy = new DFSPreorderIterativeStrategy();
		
		int[] result = strategy.visit(root);
		int[] expected = {1, 2, 4, 5, 3};
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testDFSPostOrderIterativeVisit() {
		TreeNode root = createTestTree();
		VisitStrategy strategy = new DFSPostorderIterativeStrategy();
		
		int[] result = strategy.visit(root);
		int[] expected = {5, 4, 2, 3, 1};
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testBFSIterativeVisit() {
		TreeNode root = createTestTree();
		VisitStrategy strategy = new BFSIterativeStrategy();
		
		int[] result = strategy.visit(root);
		int[] expected = {1, 2, 3, 4, 5};
		
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testBFSRecursiveVisit() {
		TreeNode root = createTestTree();
		VisitStrategy strategy = new BFSRecursiveStrategy();
		
		int[] result = strategy.visit(root);
		int[] expected = {1, 2, 3, 4, 5};
		
		assertArrayEquals(expected, result);
	}

}
