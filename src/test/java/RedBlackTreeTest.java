import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.datastructure.rbt.RedBlackImpl;
import com.andrearota.datastructure.rbt.RedBlackTree;


public class RedBlackTreeTest {
	
	@Test
	public void testInsert() {
		
		RedBlackTree rbt = new RedBlackImpl();
		assertNull(rbt.search(10));
		rbt.insert(10);
		rbt.insert(1);
		rbt.insert(11);
		assertNotNull(rbt.search(10));
		assertNotNull(rbt.search(1));
		assertNotNull(rbt.search(11));



		
	}

}
