package assignments.chap9;

public class MyString1 {
	private char[] string;

	public MyString1(char[] chars) {
		string = chars;
	}

	public char charAt(int index) {
		return string[index];
	}

	public int length() {
		return string.length;
	}

	public MyString1 substring(int begin, int end) {
		char[] sub = new char[end - begin];
		for (int i = 0, getFrom = begin; getFrom < end; i++, getFrom++) {
			sub[i] = string[getFrom];
		}
		return new MyString1(sub);
	}

	public MyString1 toLowerCase() {
		char[] lower = new char[string.length];
		for (int i = 0; i < string.length; i++) {
			if (string[i] == 'A')
				lower[i] = 'a';
			else if (string[i] == 'B')
				lower[i] = 'b';
			else if (string[i] == 'C')
				lower[i] = 'c';
			else if (string[i] == 'D')
				lower[i] = 'd';
			else if (string[i] == 'E')
				lower[i] = 'e';
			else if (string[i] == 'F')
				lower[i] = 'f';
			else if (string[i] == 'G')
				lower[i] = 'g';
			else if (string[i] == 'H')
				lower[i] = 'h';
			else if (string[i] == 'I')
				lower[i] = 'i';
			else if (string[i] == 'J')
				lower[i] = 'j';
			else if (string[i] == 'K')
				lower[i] = 'k';
			else if (string[i] == 'L')
				lower[i] = 'l';
			else if (string[i] == 'M')
				lower[i] = 'm';
			else if (string[i] == 'N')
				lower[i] = 'n';
			else if (string[i] == 'O')
				lower[i] = 'o';
			else if (string[i] == 'P')
				lower[i] = 'p';
			else if (string[i] == 'Q')
				lower[i] = 'q';
			else if (string[i] == 'R')
				lower[i] = 'r';
			else if (string[i] == 'S')
				lower[i] = 's';
			else if (string[i] == 'T')
				lower[i] = 't';
			else if (string[i] == 'U')
				lower[i] = 'u';
			else if (string[i] == 'V')
				lower[i] = 'v';
			else if (string[i] == 'W')
				lower[i] = 'w';
			else if (string[i] == 'X')
				lower[i] = 'x';
			else if (string[i] == 'Y')
				lower[i] = 'y';
			else if (string[i] == 'Z')
				lower[i] = 'z';
			else
				lower[i] = string[i];
		}
		return new MyString1(lower);
	}

	public boolean equals(MyString1 s) {
		if (string.length != s.length())
			return false;
		for (int i = 0; i < string.length; i++) {
			if (string[i] != s.charAt(i))
				return false;
		}
		return true;
	}

	public static MyString1 valueOf(int i) {
		int asciiNum = i + '0';
		char[] c = { (char) asciiNum };
		return new MyString1(c);
	}

}
