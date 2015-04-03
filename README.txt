Greetings!

Enclosures:
 1.) Subclass implemting the provided interface(AnagramFinder.java)
 2.) A unit test (4.0) has been included - tests space, printable characters new lines characters.
 3.) junit jar for version 4.7 is included(specific version to ascertain no discrepancy)
 4.) This README.txt file.
 5.) maven notes about how the projected was created from scratch.
 
 Assumptions:
 0.) Users will come utilize their own robust main program to take input. Only sample main program with two strings is provided. 
 1.) There can be only 256 of possible characters
 2.) Only English alphabets/numerals are used as input.
 3.) Only 94 printable and visible characters out of 256 possible characters are used for analysis.
 4.) Space (hex 20) and delete (hex 7f) are discarded - from set of printable characters (refer to printable set at:http://www.ascii-code.com/)
 5.) Program will be run on Java SE 6
 6.) Program .zip file will be exported into as "archive" eclipse project. For HOWTOs refer:
 http://help.eclipse.org/juno/index.jsp?topic=%2Forg.eclipse.platform.doc.user%2Ftasks%2Ftasks-importproject.htm
 7.) A build tool is not required.
 
Runtime Analysis: 
-Sorting is avoided to avoid - O(n^2) and O(nLnN) 
-Decimal value of characters are stored in memory and counted. - This took only O(n) time.

nirmalksingh
 
  
   