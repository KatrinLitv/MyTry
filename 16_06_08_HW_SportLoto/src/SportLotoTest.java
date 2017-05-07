import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SportLotoTest {
	private static final byte MIN = 1;
	private static final byte MAX = 49;
	private static final int N_TRIALS = 10000;

	@Before
	public void setUp() throws Exception {
	}

	//Check that there is no repeating
	@Test
	public void test() {
		for (int k=0; k<N_TRIALS ; k++){
			long res = SportLoto.set7numbers(MIN, MAX);
			System.out.println((char)13+"Your result is:");
			SportLoto.print7numbers(res);
			for (int i=0; i<7 ; i++){
				byte num = SportLoto.getNumber(res, i);
				for (int j=0; j<i; j++){
					assertNotEquals(num,SportLoto.getNumber(res, j));
				}
			}
		}
	}

}
