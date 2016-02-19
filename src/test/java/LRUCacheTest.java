import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.datastructure.LRUCache;


public class LRUCacheTest {

	@Test
	public void testEmptyCache() {
		
		LRUCache<String> cache = new LRUCache<String>(5);
		assertNull(cache.get("1"));
		
	}
	
	@Test
	public void testInsertion() {
		
		LRUCache<String> cache = new LRUCache<String>(5);
		
		cache.put("1", "1");
		assertEquals("1", cache.get("1"));
		
		cache.put("2", "2");
		assertEquals("2", cache.get("2"));
		
	}
	
	@Test
	public void testOverwrite() {
		
		LRUCache<String> cache = new LRUCache<String>(5);
		
		cache.put("1", "1");
		assertEquals("1", cache.get("1"));
		
		cache.put("2", "2");
		assertEquals("2", cache.get("2"));
		
		cache.put("1", "10");
		assertEquals("10", cache.get("1"));
		
	}
	
	@Test
	public void testFullCache() {
		
		LRUCache<String> cache = new LRUCache<String>(1);
		
		cache.put("1", "1");
		assertEquals("1", cache.get("1"));
		
		cache.put("2", "2");
		assertEquals("2", cache.get("2"));
		
		cache.put("3", "3");
		assertEquals("3", cache.get("3"));
		
		assertNull(cache.get("1"));
		
	}

}
