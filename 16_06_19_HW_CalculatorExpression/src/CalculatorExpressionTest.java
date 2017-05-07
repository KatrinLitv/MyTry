import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorExpressionTest {


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(20,CalculatorExpression.calculate("20 * 30/-20  +50"));
		assertEquals(80,CalculatorExpression.calculate("-20*30/-20+50"));
		assertEquals(0,CalculatorExpression.calculate("-20*30/-20+5ew0"));
		assertEquals(0,CalculatorExpression.calculate("-20*30/-0"));
		assertEquals(0,CalculatorExpression.calculate("-20*30/0"));
		assertEquals(0,CalculatorExpression.calculate("-20*30-/90"));
		assertEquals(10,CalculatorExpression.calculate("20*-3/-3+-10"));
	}

}
