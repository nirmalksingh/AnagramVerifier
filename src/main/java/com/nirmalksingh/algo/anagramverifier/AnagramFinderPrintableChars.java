package com.nirmalksingh.algo.anagramverifier;

import com.nirmalksingh.algo.anagram.AnagramFinder;

/**
 * @author nirmalksingh
 */

/**
 *  Driver program 
 */
public class AnagramFinderPrintableChars implements AnagramFinder {

	public AnagramFinderPrintableChars() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean areAnagrams(String s1, String s2) {
		
		final int NO_OF_CHARS = 256;

		/**
		 * Keep only visible printable characters whose decimal representation fall between 33 to 126 (inclusive)
		 * All other characters (including space and delete are filtered and discarded.
		 */

		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		/**
		 * Return false for anagram if lengths aren't equal.
		 */
		if (s1.length() != s2.length()) {
			return false;
		}

		/**
		 * Two different array of integers will keep count of each characters
		 * Since we are only caring about visible printable characters, we'll need only 256 
		 * spots to keep their count on their specific decimal index in integer array.
		 */
		int[] charIdxStr1 = new int[NO_OF_CHARS];// initialized to all 0 by default in heap
		int[] charIdxStr2 = new int[NO_OF_CHARS];// initialized to all 0 by default in heap
		int i;

		/**
		 * Locate the specific index within the integer array and increment the count by 
		 * one every time the same index(character) is encountered in the given string.
		 */
		for (i = 0; i < s1.length(); i++) {
			charIdxStr1[(int) s1.charAt(i)]++;
			charIdxStr2[(int) s2.charAt(i)]++;
		}

		/**
		 * Check #  check to see if any of the index are different for either of the 
		 * counts of the characters for either of the strings. If anything is different
		 *- the given strings CAN NOT be anagrams
		 */
		for (i = 0; i < NO_OF_CHARS; i++) {
			if (charIdxStr1[i] != charIdxStr2[i]) {
				return false;
			}
		}
		return true;
	}
}