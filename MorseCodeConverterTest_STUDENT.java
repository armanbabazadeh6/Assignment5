
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @author armanbabazadeh
 */
public class MorseCodeConverterTest_STUDENT {

	/**
	 * Testing if conversion from morse code to english
	 */
	@Test
	public void testConvertToEnglishString() {
		String converter1 = MorseCodeConverter
				.convertToEnglish(".... --- .-- / .- .-. . / -.-- --- ..- / -.. --- .. -. --.");
		assertEquals("how are you doing", converter1);
	}

	/**
	 * Test the DaisyDaissy text file conversion from morseFile to English
	 */
	@Test
	public void testConvertMorseFileToEnglishString() {
		File file = new File("src/DaisyDaisy.txt");
		try {
			assertEquals("im half crazy all for the love of you", MorseCodeConverter.convertToEnglish(file));
		} catch (FileNotFoundException e) {
			assertTrue("An unwanted exception was caught", false);
		}
	}

}
