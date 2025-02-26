package codingBat;

public class CodingBat {
	public static String wordEnds(String str, String word) {
		StringBuilder sb = new StringBuilder();
		int stringLength = str.length();
		int wordLength = word.length();
		int a = stringLength - wordLength;
		
		for(int i = 0; i <= a; i++) {
			if(str.substring(i, i + wordLength).equals(word)) {
				if(i > 0) {
					sb.append(str.charAt(i - 1));
				}
				if(i + wordLength < stringLength) {
					sb.append(str.charAt(i + wordLength));
				}
			}
		}
		return sb.toString();
	}
}
