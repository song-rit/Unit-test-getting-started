import static org.junit.Assert.*;

import org.junit.Test;

public class RegexMatcherTest {

	RegexMatcher regexMatcher = new RegexMatcher();
	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	public void digitTest() {
		assertEquals(true, regexMatcher.isNumberPattern("123456789"));
	}
	
	@Test
	public void letterTest() {
		assertEquals(true, regexMatcher.isLetterPattern("abcdefghijklmnopqurstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
	}
	
	@Test
	public void whiteSpaceTest() {
		assertEquals(true, regexMatcher.isWhiteSpacePattern("           "));
	}

}
