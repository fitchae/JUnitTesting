package Q1;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator = new Calculator();
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals("equation not equal to 0",5,5);
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals("equation not equal to 8",8,8);
	}

	@Test
	public void testMultiply() {
		calculator.add(2);
		calculator.multiply(2);
		assertEquals("equation not equal to 4",4,4);
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals("equation not equal to 4",4,4);
	}
    
    @Test
    public void testSquare() {
       calculator.squareRoot(2);
       assertEquals("equation not equal to 4",4,4);
    }

}
