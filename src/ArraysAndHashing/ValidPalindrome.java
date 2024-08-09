package ArraysAndHashing;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "0P";
		System.out.println(isPalindrome(s));

	}

	private static boolean isPalindrome(String s) {
		StringBuilder str = new StringBuilder();
		s = s.toLowerCase();
		int size = s.length();
		for (int i = 0; i < size; i++) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c>='0' && c<='9')) {
				str.append(c);
			}
		}
		System.out.println("1---" + str);
		StringBuilder str2 = new StringBuilder(str);
		str2.reverse();
		System.out.println("1---" + str2);
		if (equals(str,str2)) {
			return true;
		}
		return false;
	}

	public static boolean equals(StringBuilder str, StringBuilder str2) {
		if(str.length()!=str2.length()) {
			return false;
		}
		for(int i = 0 ; i<str.length() ; i++) {
			char c1= str.charAt(i);
			char c2 = str2.charAt(i);
			if(c1 != c2) {
				return false;
			}
		}
		return true;
	}

}
