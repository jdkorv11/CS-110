package assignments.wordsearch;

public class WordChecker {
	private int wordLocation;

	public WordVector findWord(String[] horizontalTemplate,
			String[] verticalTemplate, String word) {
		WordVector wv;
		int[] wordStart = new int[2];
		wordStart = easterlyCheck(horizontalTemplate, word);
		if (wordStart[0] != -1) {
			wv = new WordVector(wordStart[0], wordStart[1], word.length(),
					Direction.EASTERLY);
			return wv;
		}
		wordStart = westerlyCheck(horizontalTemplate, word);
		if (wordStart[0] != -1) {
			wv = new WordVector(wordStart[0], wordStart[1], word.length(),
					Direction.WESTERLY);
			return wv;
		}
		wordStart = southerlyCheck(verticalTemplate, word);
		if (wordStart[0] != -1) {
			wv = new WordVector(wordStart[0], wordStart[1], word.length(),
					Direction.SOUTHERLY);
			return wv;
		}
		wordStart = northerlyCheck(verticalTemplate, word);
		if (wordStart[0] != -1) {
			wv = new WordVector(wordStart[0], wordStart[1], word.length(),
					Direction.NORTHERLY);
			return wv;
		}
		return null;
	}

	private int[] easterlyCheck(String[] template, String word) {
		int[] wordFoundAt = { -1, -1 };
		for (int i = 0; i < template.length; i++) {
			wordLocation = isWord(template[i], word);
			if (wordLocation != -1) {
				wordFoundAt[0] = i;
				wordFoundAt[1] = wordLocation;
				return wordFoundAt;
			}
		}
		return wordFoundAt;
	}

	private int[] westerlyCheck(String[] template, String word) {
		int[] wordFoundAt = { -1, -1 };
		word = new StringBuffer(word).reverse().toString();
		for (int i = 0; i < template.length; i++) {
			wordLocation = isWord(template[i], word);
			if (wordLocation != -1) {
				wordFoundAt[0] = i;
				wordFoundAt[1] = wordLocation + word.length() - 1;
				return wordFoundAt;
			}
		}
		return wordFoundAt;
	}

	private int[] southerlyCheck(String[] template, String word) {
		int[] wordFoundAt = { -1, -1 };
		for (int i = 0; i < template.length; i++) {
			wordLocation = isWord(template[i], word);
			if (wordLocation != -1) {
				wordFoundAt[1] = i;
				wordFoundAt[0] = wordLocation;
				return wordFoundAt;
			}
		}
		return wordFoundAt;
	}

	private int[] northerlyCheck(String[] template, String word) {
		int[] wordFoundAt = { -1, -1 };
		word = new StringBuffer(word).reverse().toString();
		for (int i = 0; i < template.length; i++) {
			wordLocation = isWord(template[i], word);
			if (wordLocation != -1) {
				wordFoundAt[1] = i;
				wordFoundAt[0] = wordLocation + word.length() - 1;
				return wordFoundAt;
			}
		}
		return wordFoundAt;
	}

	private int isWord(String puzzleLine, String word) {
		int wordAt = -1;

		if (puzzleLine.contains(word)) {
			wordAt = puzzleLine.indexOf(word);
		}

		return wordAt;
	}

}
