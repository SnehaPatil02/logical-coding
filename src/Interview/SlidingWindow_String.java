package Interview;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow_String {

	public static final int char_range = 128;

	public static final String longestSubString(String s, int k) {
		if (s == null || s.length() == 0) {
			return s;
		}
		int begin =0, end = 0;

		Set<Character> set = new HashSet<>();
		int freq[] = new int [char_range];


		for(int i=0, j=0; j<s.length(); j++) {
			set.add(s.charAt(j));
			freq[s.charAt(j)]++;


			while(set.size() > k) {
				if (--freq[s.charAt(i)] == 0) {
					set.remove(s.charAt(i));
				}

				i++;	
			}
			if (end - begin < j - i)
			{
				end = j;
				begin = i;
			}
		}

		return s.substring(begin, end+1);
	}

	public static void main(String[] args) {
		String s = "abcbdbdbbdcdabd";
		int k = 2;

		System.out.println(longestSubString(s, k));

	}

}
