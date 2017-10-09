package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	public void testTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
	
	@Test
	public void testMultipleNumbers() {
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
	
	@Test
	public void testMultipleNewLine() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
	@Test
	public void testMultipleNewLineAndComma() {
		assertEquals(6, StringCalculator.add("1,2\n3"));
	}
	
	/*@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testNegatives(){
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Negatives not allowed: -1");
		StringCalculator.add("-1,2");		
	}*/
	
	@Test
	public void testBiggerThan1000() throws Exception{
		assertEquals(1003, StringCalculator.add("1001,2"));
	}
}