import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.datastructure.MaxPriorityQueue;


public class MaxPriorityQueueTest{

	@Test
	public void testSwim() {
		
		MaxPriorityQueue mpq = new MaxPriorityQueue(10);
		int[] arr = {0, 10, 8, 9, 2, 1, 3, 11};
		int[] expected = {0, 11, 8, 10, 2, 1, 3, 9};
		
		mpq.swim(arr, 8, 7);
		assertArrayEquals(expected, arr);
		
	}
	
	@Test
	public void testSink() {
		
		MaxPriorityQueue mpq = new MaxPriorityQueue(10);
		int[] arr = {0, 0, 8, 10, 2, 1, 3, 9};
		int[] expected = {0, 10, 8, 9, 2, 1, 3, 0};
		
		mpq.sink(arr, 8, 1);
		assertArrayEquals(expected, arr);
		
	}

	@Test
	public void testInsert() {
		
		MaxPriorityQueue mpq = new MaxPriorityQueue(10);
		
		mpq.insert(10);
		mpq.insert(20);
		mpq.insert(8);
		mpq.insert(0);
		mpq.insert(200);

		assertEquals(200, mpq.getMax());
		
	}
	
	@Test
	public void testDeleteMax() {
		
		MaxPriorityQueue mpq = new MaxPriorityQueue(10);
		
		mpq.insert(10);
		mpq.insert(20);
		mpq.insert(8);
		mpq.insert(0);
		mpq.insert(200);

		assertEquals(200, mpq.deleteMax());
		assertEquals(20, mpq.deleteMax());
		assertEquals(10, mpq.deleteMax());
		assertEquals(8, mpq.deleteMax());
		assertEquals(0, mpq.deleteMax());


	}
	
}
