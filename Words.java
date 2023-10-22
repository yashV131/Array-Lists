import java.util.ArrayList;
import java.util.Collections;

public class Words {
	private ArrayList<Word> words;

	public Words() {
		words = new ArrayList<Word>();
		setWords("");
	}

	public Words(String wordList) {
		words = new ArrayList<Word>();
		setWords(wordList);
	}

	public void setWords(String wordList) {
		String[] wordArray = wordList.split(" ");
		for (String word : wordArray) {
			words.add(new Word(word));
		}
	}

	public int countWordsWithXChars(int size) {
		int count = 0;
		for (Word word : words) {
			if (word.getLength() == size) {
				count++;
			}
		}
		return count;
	}

	public int removeWordsWithXChars(int size) {
		int sumVowels = 0;
		ArrayList<Word> wordsToRemove = new ArrayList<Word>();
		for (Word word : words) {
			if (word.getLength() == size) {
				sumVowels += word.getNumVowels();
				wordsToRemove.add(word);
			}
		}
		words.removeAll(wordsToRemove);
		return sumVowels;
	}

	public int countWordsWithXVowels(int numVowels) {
		int count = 0;
		for (Word word : words) {
			if (word.getNumVowels() == numVowels) {
				count++;
			}
		}
		return count;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Word word : words) {
			result.append(word.toString()).append("\n");
		}
		return result.toString();
	}
}
