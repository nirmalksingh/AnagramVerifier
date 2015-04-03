package com.nirmalksingh.algo.anagramverifier;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fiveamsolutions.interview.AnagramFinder.AnagramFinder;

/**
 * @author nirmalksingh
 *
 */

public class AnagramTest{
	
	private AnagramFinder instance;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		instance = new AnagramFinderPrintableChars();
	}

	@After
	public void tearDown() throws Exception {
		instance=null;
	}

	/**
	 * Test for a wrong sequence of higher and lower indicator values entered by user.
	 * 
	 */
	@Test
	public void testAnagramOne() {
		String testStr1 = "";
		String testStr2 = ",";
		boolean notTrue = instance.areAnagrams(testStr1, testStr2);
		System.out.println("Test # 1: "+testStr1+" AND "+ testStr2+" ARE NOT ANAGRAMS");
		assertEquals(false, notTrue);
	}	
	
	@Test
	public void testAnagramTwo() {
		String testStr1 = "postmaster";
		String testStr2 = "stamp store";
		boolean yesTrue = instance.areAnagrams(testStr1, testStr2);
		System.out.println("Test # 2: "+testStr1+" AND "+ testStr2+" ARE ANAGRAMS");
		assertEquals(true, yesTrue);
	}
	
	@Test
	public void testAnagramThree() {
		String testStr1 = "@yinyang";
		String testStr2 = "@  yangyi\nn";
		boolean yesTrue = instance.areAnagrams(testStr1, testStr2);
		System.out.println("Test # 3: "+testStr1+" AND "+ testStr2+" ARE ANAGRAMS");
		assertEquals(true, yesTrue);
	}
	
	
	@Test
	public void testAnagramFour() {
		String testStr1 = "to see place";
		String testStr2 = "a telescope";
		boolean yesTrue = instance.areAnagrams(testStr1, testStr2);
		System.out.println("Test # 4: "+testStr1+" AND "+ testStr2+" ARE ANAGRAMS");
		assertEquals(true, yesTrue);
	}
	
	
	@Test
	public void testAnagramFive() {
		String testStr1 = "ZZYZX";
		String testStr2 = "  X Y ZZZ";
		boolean yesTrue = instance.areAnagrams(testStr1, testStr2);
		System.out.println("Test # 5: "+testStr1+" AND "+ testStr2+" ARE ANAGRAMS");
		assertEquals(true, yesTrue);
	}
	
	@Test
	public void testAnagramSix() {
		String testStr1 = "Eleven plus two";
		String testStr2 = "  Twelve plus one";
		boolean yesTrue = instance.areAnagrams(testStr1, testStr2);
		System.out.println("Test # 6: "+testStr1+" AND "+ testStr2+" ARE ANAGRAMS");
		assertEquals(true, yesTrue);
	}
		
	
}
