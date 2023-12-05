
/**
 * @author armanbabazadeh Tree Node external
 */
public class TreeNode<T> {

	protected T data;
	protected TreeNode<T> left;
	protected TreeNode<T> right;

	/**
	 * TreeNode with left and right child
	 */
	public TreeNode(T dataNode) {
		this.data = dataNode;
		this.left = null;
		this.right = null;
	}

	/**
	 * used for making deep copies
	 * 
	 * @param TreeNode<T> node
	 */
	public TreeNode(TreeNode<T> node) {
		data = node.data;
		left = node.left;
		right = node.right;
	}

	/**
	 * Return the data
	 * 
	 * @return the data
	 */
	public T getData() {
		return data;
	}

}