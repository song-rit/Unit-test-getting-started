import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class OddEventNumberTest {
	
	OddEvenNumber o = new OddEvenNumber();
	
	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	public void testOddNumber() {
		
		int[] numOdd = {1, 3, 5, 7, 9};
//		System.out.println(Arrays.toString(numOdd));
		
		for(int i = 0; i < numOdd.length; i++) {
			assertEquals(true, o.isOddNumber(numOdd[i]));
		}
		
		
		int[] numEven = {0, 2, 4, 6, 8};

		for(int i = 0; i < numEven.length; i++) {
			assertEquals(false, o.isOddNumber(numEven[i]));
		}
		
		
	}
	
	@Test
	public void testEvenNumber() {
		int[] numOdd = {1, 3, 5, 7, 9, 11, 13, 15};
//		System.out.println(Arrays.toString(numOdd));
		
		for(int i = 0; i < numOdd.length; i++) {
			assertEquals(false, o.isEventNumber(numOdd[i]));
		}
		
		
		int[] numEven = {0, 2, 4, 6, 8};

		for(int i = 0; i < numEven.length; i++) {
			assertEquals(true, o.isEventNumber(numEven[i]));
		}
	}

}
