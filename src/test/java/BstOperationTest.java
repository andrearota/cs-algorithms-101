import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.datastructure.bst.BST;
import com.andrearota.datastructure.bst.BinaryTreeNode;


public class BstOperationTest {

	protected BinaryTreeNode root = new BinaryTreeNode(10);
	protected BinaryTreeNode a = new BinaryTreeNode(5);
	protected BinaryTreeNode b = new BinaryTreeNode(7);
	protected BinaryTreeNode c = new BinaryTreeNode(2);
	protected BinaryTreeNode d = new BinaryTreeNode(45);
	
	protected BinaryTreeNode generateTree() {
		
		// Topology:
		//   10
		//	5  45
		// 2 7
		
		root.setLeft(a);
		root.setRight(d);
		a.setLeft(c);
		a.setRight(b);
		
		return root;
		
	}
	
	@Test
	public void searchSuccess() {
		BinaryTreeNode tree = generateTree();
		assertEquals(b, BST.search(tree, 7));
	}
	
	@Test
	public void searchNoSuccess() {
		BinaryTreeNode tree = generateTree();
		assertEquals(null, BST.search(tree, 3));
	}
	
	@Test
	public void insertionExistentElement() {
		BinaryTreeNode tree = generateTree();
		assertEquals(false, BST.insert(tree, 2));
		assertEquals(c, BST.search(tree, 2));
	}

	@Test
	public void insertionNonExistentElement() {
		BinaryTreeNode tree = generateTree();
		assertEquals(true, BST.insert(tree, 3));
		assertNotNull(BST.search(tree, 3));
	}
	
}
