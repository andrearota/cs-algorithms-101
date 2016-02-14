import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.datastructure.tree.AvlNode;
import com.andrearota.datastructure.tree.AvlTree;


public class AvlTreeTest {

	@Test
	public void test() {
		
		AvlTree tree = new AvlTree();
		
		AvlNode root = tree.insert(10, null);
		root = tree.insert(20, root);
		root = tree.insert(30, root);
		root = tree.insert(5, root);
		root = tree.insert(1, root);
		
	}

}
