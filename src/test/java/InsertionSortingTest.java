import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.sorting.InsertionSortStrategy;
import com.andrearota.sorting.SortingStrategy;


public class InsertionSortingTest {

	@Test
	public void testSorting() {
		
		SortingStrategy algorithm = new InsertionSortStrategy();
		
		int[] input = {10, 3, 4, -2, 4, 59, 59};
		int[] expected = {-2, 3, 4, 4, 10, 59, 59};
		
		int[] result = algorithm.sort(input);		
		assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void testSortingEmptyArray() {
		
		SortingStrategy algorithm = new InsertionSortStrategy();
		
		int[] input = {};
		int[] expected = {};
		
		int[] result = algorithm.sort(input);		
		assertArrayEquals(expected, result);
		
	}

}
