import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandartFunctions {

	@Test
	void Sin() {
		assertEquals(1,StandardFunctions.Sin(90),0.05);
	}
	
	@Test
	void Cos(){
		assertEquals(0,StandardFunctions.Cos(90),0.05);
	}
	
	@Test
	void Tan(){
		assertEquals(1,StandardFunctions.Tan(45),0.05);
	}
	
	
	@Test
	void radiansToDegrees(){
		assertSame(1,StandardFunctions.radiansToDegrees(57.29));
	}

}
