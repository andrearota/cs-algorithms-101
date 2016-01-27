import static org.junit.Assert.*;

import org.junit.Test;

import com.andrearota.general.hackerrank.MazeSolver;


public class MazeSolverTest {

	@Test
	public void testGoodOne() {
		
		char[][] maze = {
			{'E', '.', '.', '.'},
			{'X', '.', 'X', '.'},
			{'.', 'X', 'S', '.'},
		};
		
		MazeSolver solver = new MazeSolver();
		assertEquals(6, solver.minMoves(maze));
	}
	
	@Test
	public void testImpossible() {
		
		char[][] maze = {
			{'E', '.', 'X', '.'},
			{'X', '.', 'X', '.'},
			{'.', 'X', 'S', '.'},
		};
		
		MazeSolver solver = new MazeSolver();
		assertEquals(-1, solver.minMoves(maze));

	}

}
