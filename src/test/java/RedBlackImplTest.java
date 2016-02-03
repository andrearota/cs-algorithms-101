import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.datastructure.rbt.Node;
import com.andrearota.datastructure.rbt.NodeColor;

public class RedBlackImplTest {

	@Test
	public void test() {
		
		Node n1 = new Node(1, NodeColor.BLACK, null, null, null);
		Node n2 = new Node(2, NodeColor.BLACK, null, null, null);
		Node n3 = new Node(3, NodeColor.BLACK, null, null, null);
		Node n4 = new Node(4, NodeColor.BLACK, null, null, null);
		Node n6 = new Node(6, NodeColor.BLACK, null, null, null);

		n3.setLeft(n1);
		n1.setParent(n3);
		n3.setLeft(n4);
		n4.setParent(n3);
		
		
		
	}

}
