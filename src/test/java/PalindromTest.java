import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromTest {

	Palindrom p = new Palindrom();
	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	public void testPalindrom() {
		
		assertEquals(true, p.isPalindrom("12321"));
		assertEquals(true, p.isPalindrom("A"));
		assertEquals(true, p.isPalindrom("B"));
		assertEquals(true, p.isPalindrom("C"));
		assertEquals(true, p.isPalindrom("ABA"));
		assertEquals(true, p.isPalindrom("12321"));
		assertEquals(true, p.isPalindrom("22222"));
		assertEquals(true, p.isPalindrom("101"));
		assertEquals(true, p.isPalindrom("ABCBA"));
		assertEquals(true, p.isPalindrom(p.parseToPalindrom("123")));
	}

}
