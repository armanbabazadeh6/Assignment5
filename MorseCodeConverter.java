
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The MorseCodeConverter
 * 
 * @author armanbabazadeh
 * @date 11/15/2023
 */
public class MorseCodeConverter {

	private static MorseCodeTree tree = new MorseCodeTree();

	MorseCodeConverter() {
	}

	/**
	 * Converts morsecode into english
	 * 
	 * @param morseCode
	 * @return
	 */
	public static String convertToEnglish(String morseCode) {
		StringBuilder english = new StringBuilder();

		for (String word : morseCode.split(" / ")) {
			for (String morseChar : word.split(" ")) {
				english.append(tree.fetch(morseChar));
			}
			english.append(" ");
		}

		return english.toString().trim();
	}

	/**
	 * Converts morsecode into english
	 * 
	 * @param codeFile
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String convertToEnglish(File codeFile) throws FileNotFoundException {
		Scanner scan = new Scanner(codeFile);
		String data = "";
		while (scan.hasNextLine()) {
			data += scan.nextLine();
		}
		scan.close();
		return convertToEnglish(data);
	}

	/**
	 * Prints tree out for test
	 * 
	 * @return
	 */
	public static String printTree() {
		return String.join(" ", tree.toArrayList());
	}

}
