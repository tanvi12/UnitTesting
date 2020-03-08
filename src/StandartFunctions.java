import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandartFunctions {

	@Test
	void Sin() {
		assertEquals(1,StandardFunctions.Sin(90));
	}
	
	@Test
	void Cos(){
		assertEquals(1,StandardFunctions.Cos(0));
	}
	
	@Test
	void Tan(){
		assertEquals(1,StandardFunctions.Tan(45));
	}
	
	
	@Test
	void radiansToDegrees(){
		assertSame(1,StandardFunctions.radiansToDegrees(57.29));
	}

}
