package com.nirmalksingh.algo.anagramverifier;

import com.fiveamsolutions.interview.AnagramFinder.AnagramFinder;

public class AnagramFinderMain {
	
	public static void main(String[] args) {
		
		AnagramFinder instance = new AnagramFinderPrintableChars();
		
		String testStr1 = "Punishment";
		String testStr2 = "Nine Thumps";
		
		boolean trueFalse = instance.areAnagrams(testStr1, testStr2);
		
		if(trueFalse==true){
			System.out.println(testStr1+" AND "+ testStr2+" ARE ANAGRAMS");
		}else{
			System.out.println(testStr1+" AND "+ testStr2+" ARE NOT ANAGRAMS");
		}
	}
}
