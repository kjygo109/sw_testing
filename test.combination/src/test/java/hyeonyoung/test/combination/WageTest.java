package hyeonyoung.test.combination;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WageTest {

	int expectedWage;
	Proficiency type;
	int workingHours;
	
	
	@Parameters
	public static Collection getParameters() {
		return Arrays.asList(new Object[][] {
			{160000, Proficiency.E, 2},
			{3600000, Proficiency.E, 30},
		});
	}
	
	public WageTest(int expectedWage, Proficiency type, int workingHours) {
		this.expectedWage = expectedWage;
		this.type = type;
		this.workingHours = workingHours;
	}
	
	@Test
	public void test_calculatePay_with_each_choice() throws Exception {
		int wage = Wage.calculatePay(type, workingHours);
		assertEquals(expectedWage, wage);
	}

}
