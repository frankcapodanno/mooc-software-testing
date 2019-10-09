package tudelft.countletters;

public class CountLetters {

	public int count(String str) {
		int words = 0;
		char last;
		int lenght = str.length();
		boolean atEnd = false;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < lenght; i++) {
			last = charArray[i];
			int nextPos = i + 1;
			if (nextPos >= lenght) {
				nextPos = i;
				atEnd = true;
			}

			if (Character.isLetter(last)) {
				if ((last == 'r' || last == 's' || last == 'x')
						&& ((atEnd) || (!Character.isLetter(charArray[nextPos])))) {
					words++;
				}
			}
		}
		return words;
	}
}