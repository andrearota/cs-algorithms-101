import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.util.ArrayUtil;

public class ArrayUtilTest {

	@Test
	public void testMerge() {

		int[] arr1 = { 1, 5, 7 };
		int[] arr2 = { 2, 3, 4, 6 };
		int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

		int[] result = ArrayUtil.merge(arr1, arr2);

		assertArrayEquals(expected, result);

	}

	
}
