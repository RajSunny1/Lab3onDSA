package greatlarninglab3;
import java.util.HashSet;


public class FindSumPair {
	 public FindSumPair() {
	    }

	    public Node insert(Node root, int key) {
	        if (root == null) {
	            return new Node(key);
	        } else {
	            if (key < root.data) {
	                root.leftNode = this.insert(root.leftNode, key);
	            } else {
	                root.rightNode = this.insert(root.rightNode, key);
	            }

	            return root;
	        }
	    }

	    public boolean findPairUtil(Node root, int sum, HashSet<Integer> set) {
	        if (root == null) {
	            return false;
	        } else if (this.findPairUtil(root.leftNode, sum, set)) {
	            return true;
	        } else if (set.contains(sum - root.data)) {
	            System.out.println("pair is found " + (sum - root.data) + "," + root.data);
	            return true;
	        } else {
	            set.add(root.data);
	            return this.findPairUtil(root.rightNode, sum, set);
	        }
	    }

	    public void findPairWithGivenSum(Node root, int sum) {
	        HashSet<Integer> set = new HashSet();
	        if (!this.findPairUtil(root, sum, set)) {
	            System.out.print("Pair does not exist");
	        }


}
}
