package Array;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static char[] generateArray(String str){
		char[] stringArr = str.toCharArray();
		return stringArr;
	}

	public static void main(String[] args) {
		char[] arr;
		arr = generateArray("abcabcbb");
		char[] a = new char[arr.length];
		System.arraycopy(arr, 0, a, 0, 6);
		System.out.println(Arrays.toString(a));

	}

}
