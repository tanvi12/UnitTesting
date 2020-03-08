import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandartFunctions {

	@Test
	void Sin() {
		assertEquals(1,StandardFunctions.TrigonometricFunctions.Sin(90));
	}
	
	@Test
	void Cos(){
		assertEquals(1,StandardFunctions.TrigonometricFunctions.Cos(0));
	}
	
	@Test
	void Tan(){
		assertEquals(1,StandardFunctions.TrigonometricFunctions.Tan(45));
	}
	
	
	@Test
	void radiansToDegrees(){
		assertSame(1,StandardFunctions.TrigonometricFunctions.radiansToDegrees(57.29));
	}

}
