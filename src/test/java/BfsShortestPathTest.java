import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.andrearota.general.graph.BfsShortestPathSolution;
import com.andrearota.general.graph.Node;


public class BfsShortestPathTest {

	@Test
	public void test() {
		
		List<Node> graph = new ArrayList<Node>();
		
		Node n1 = new Node("1");
		Node n2 = new Node("2");
		Node n3 = new Node("3");
		Node n4 = new Node("4");
		
		n1.getEdges().add(n2);
		n1.getEdges().add(n3);
		
		graph.add(n1);
		graph.add(n2);
		graph.add(n3);
		graph.add(n4);
		
		int[] solution = BfsShortestPathSolution.getShortestDistances(graph, "1");
		int[] expected = {6, 6, -1};

		assertEquals(expected, solution);
	}

}
