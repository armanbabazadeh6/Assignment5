import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * @author armanbabazadeh MorseCodeTree student test
 *
 */
public class MorseCodeTreeTest_STUDENT {

	MorseCodeTree TREETEST = new MorseCodeTree();

	@Test
	public void testAddNode1() {
		TREETEST.addNode(TREETEST.getRoot(), "--.", "g");
		assertEquals("g", TREETEST.fetch("--."));
	}

	@Test
	public void testAddNode2() {
		TREETEST.addNode(TREETEST.getRoot(), "...-", "v");
		assertEquals("v", TREETEST.fetch("...-"));
	}

	@Test
	public void testFetchNode() {
		assertEquals("o", TREETEST.fetchNode(TREETEST.getRoot(), "---"));
	}

}
