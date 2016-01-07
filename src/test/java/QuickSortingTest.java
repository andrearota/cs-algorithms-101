import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.andrearota.sorting.QuickSortStrategy;
import com.andrearota.sorting.SortingStrategy;


public class QuickSortingTest {

	@Test
	public void testSorting() {
		
		SortingStrategy algorithm = new QuickSortStrategy();
		
		int[] input = {10, 3, 4, -2, 4, 59, 59};
		int[] expected = {-2, 3, 4, 4, 10, 59, 59};
		
		int[] result = algorithm.sort(input);		
		assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void testSortingEmptyArray() {
		
		SortingStrategy algorithm = new QuickSortStrategy();
		
		int[] input = {};
		int[] expected = {};
		
		int[] result = algorithm.sort(input);		
		assertArrayEquals(expected, result);
		
	}
	
	@Test
	public void testSortingOneElementArray() {
		
		SortingStrategy algorithm = new QuickSortStrategy();
		
		int[] input = {1};
		int[] expected = {1};
		
		int[] result = algorithm.sort(input);		
		assertArrayEquals(expected, result);
		
	}

}
