import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.andrearota.datastructure.HashTable;
import com.andrearota.datastructure.SeparateChainingHashTable;


public class HashTableTest {

	@Test
	public void testPut() {
		HashTable table = new SeparateChainingHashTable();
		table.put(1, "alice");
		table.put(2, "bob");
		
		assertEquals("alice", table.get(1));
		assertEquals("bob", table.get(2));
		assertNull(table.get(3));
		
	}
	
	@Test
	public void testCount() {
		HashTable table = new SeparateChainingHashTable();
		table.put(1, "alice");
		table.put(2, "bob");
		table.put(2, "bob");
		
		assertEquals(2, table.size());
	}
	
	@Test
	public void testDelete() {
		HashTable table = new SeparateChainingHashTable();
		table.put(1, "alice");
		table.put(2, "bob");
		
		table.delete(1);
		
		assertNull(table.get(1));
		assertEquals(1, table.size());
	}

}
