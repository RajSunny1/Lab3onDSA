package greatlarninglab3;
import greatlarninglab3.Node;
import greatlarninglab3.FindSumPair;
import java.util.Scanner;


public class BST {
	public BST() {
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	   
	        Node root = null;
	        FindSumPair findsp = new FindSumPair();
	        root = findsp.insert(root, 40);
	        root = findsp.insert(root, 20);
	        root = findsp.insert(root, 60);
	        root = findsp.insert(root, 10);
	        root = findsp.insert(root, 30);
	        root = findsp.insert(root, 50);
	        root = findsp.insert(root, 70);
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the sum that you want to check");
	        int sum = sc.nextInt();
	        findsp.findPairWithGivenSum(root, sum);
	        sc.close();

	  
	}

}
