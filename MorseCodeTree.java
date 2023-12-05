
import java.util.ArrayList;

/**
 * @author armanbabazadeh This is the class which builds the MorseCodeTree
 *
 */
public class MorseCodeTree implements LinkedConverterTreeInterface<String> {

	private TreeNode<String> root;

	/**
	 * Calls buildTree method
	 */
	MorseCodeTree() {
		buildTree();
	}

	/**
	 * This addNode method inserts a new node with the given Morse code and
	 * corresponding letter into the tree
	 */
	@Override
	public void addNode(TreeNode<String> root, String code, String letter) {
		if (code.length() == 1) {
			if (code.equals(".")) {
				root.left = new TreeNode<>(letter);
			} else {
				root.right = new TreeNode<>(letter);
			}
		} else {
			TreeNode<String> childNode = (code.charAt(0) == '.') ? root.left : root.right;
			addNode(childNode, code.substring(1), letter);
		}
	}

	/**
	 * This method is building the MorseCodeTree
	 */
	@Override
	public void buildTree() {
		root = new TreeNode<String>("");

		insert(".", "e");
		insert("-", "t");
		insert("..", "i");
		insert(".-", "a");
		insert("-.", "n");
		insert("--", "m");
		insert("...", "s");
		insert("..-", "u");
		insert(".-.", "r");
		insert(".--", "w");
		insert("-..", "d");
		insert("-.-", "k");
		insert("--.", "g");
		insert("---", "o");
		insert("....", "h");
		insert("...-", "v");
		insert("..-.", "f");
		insert(".-..", "l");
		insert(".--.", "p");
		insert(".---", "j");
		insert("-...", "b");
		insert("-..-", "x");
		insert("-.-.", "c");
		insert("-.--", "y");
		insert("--..", "z");
		insert("--.-", "q");
	}

	/**
	 * Unsupported
	 */
	@Override
	public MorseCodeTree delete(java.lang.String data) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	/**
	 * Calls the recursive method fetchNode
	 */
	@Override
	public String fetch(java.lang.String code) {
		return fetchNode(root, code);
	}

	/**
	 * This is the recursive method that fetches the data of the TreeNode
	 */
	@Override
	public String fetchNode(TreeNode<String> root, String code) {
		if (code.length() == 1) {
			return (code.equals(".")) ? root.left.getData() : root.right.getData();
		} else {
			TreeNode<String> childNode = (code.charAt(0) == '.') ? root.left : root.right;
			return fetchNode(childNode, code.substring(1));
		}
	}

	/**
	 * return root
	 */
	@Override
	public TreeNode<String> getRoot() {
		return root;
	}

	/**
	 * Adds element to the correct position in the tree
	 */
	@Override
	public void insert(java.lang.String code, java.lang.String letter) {
		addNode(root, code, letter);
	}

	/**
	 * The recursive method to put it in order
	 */
	@Override
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		if (root == null) {
			return;
		}

		LNRoutputTraversal(root.left, list);
		list.add(root.getData());
		LNRoutputTraversal(root.right, list);
	}

	/**
	 * setting the root
	 */
	@Override
	public void setRoot(TreeNode<java.lang.String> newNode) {
		root = new TreeNode<String>(newNode);
	}

	/**
	 * Ensuring if the tree was built correctly
	 */
	@Override
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		LNRoutputTraversal(root, list);
		return list;
	}

	/**
	 * Unsupported
	 */
	@Override
	public MorseCodeTree update() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

}