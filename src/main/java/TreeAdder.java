import com.andrearota.datastructure.tree.BinaryNode;


public class TreeAdder {
	
	public static int add(BinaryNode node, int currentValue) {
		
		if(node.left != null || node.right != null) {
			int leftSum = add(node.left, node.value);
			int rightSum = add(node.right, node.value);
		} 
		
		return node.value;
		
	}

}
