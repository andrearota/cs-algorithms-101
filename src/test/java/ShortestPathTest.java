import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.andrearota.datastructure.graph.Edge;
import com.andrearota.datastructure.graph.GraphAlgoritms;
import com.andrearota.datastructure.graph.LabelVertex;


public class ShortestPathTest {

	private static List<LabelVertex> createGraph() {
		
		List<LabelVertex> result = new LinkedList<LabelVertex>();
		
		LabelVertex v1 = new LabelVertex("1");
		LabelVertex v2 = new LabelVertex("2");
		LabelVertex v3 = new LabelVertex("3");
		LabelVertex v4 = new LabelVertex("4");
		LabelVertex v5 = new LabelVertex("5");

		v1.getEdges().add(new Edge(v2, 6));
		v1.getEdges().add(new Edge(v3, 6));
		v2.getEdges().add(new Edge(v3, 6));
		v2.getEdges().add(new Edge(v4, 6));		
		
		result.add(v1);
		result.add(v2);
		result.add(v3);
		result.add(v4);
		result.add(v5);
			
		return result;
	}
	
	@Test
	public void test() {
		
		List<LabelVertex> graph = createGraph();
		
		int[] relativeDistances= GraphAlgoritms.relativeShortestDistances(graph, "1");
		int[] expected = {6, 6, 12, -1};
		assertArrayEquals(expected, relativeDistances);
	}

}
