import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StandartFunctions {

	/**
	 * Compare Math and Taylor series output
	 */
	@Test
	void Sin() {
		assertEquals(Math.sin(30),StandardFunctions.TrigonometricFunctions.Sin(30),0.05);
		assertEquals(Math.sin(90),StandardFunctions.TrigonometricFunctions.Sin(90),0.05);
		assertEquals(Math.sin(180),StandardFunctions.TrigonometricFunctions.Sin(180),0.05);
		assertEquals(Math.sin(360),StandardFunctions.TrigonometricFunctions.Sin(360),0.05);
	}
	
	/**
	 * Compare Math and Taylor series output
	 */
	@Test
	void Cos(){
		assertEquals(Math.cos(30),StandardFunctions.TrigonometricFunctions.Cos(30),0.05);
		assertEquals(Math.cos(90),StandardFunctions.TrigonometricFunctions.Cos(90),0.05);
		assertEquals(Math.cos(180),StandardFunctions.TrigonometricFunctions.Cos(180),0.05);
		assertEquals(Math.cos(360),StandardFunctions.TrigonometricFunctions.Cos(180),0.05);
	}
	
	/**
	 * Compare Math and Taylor series output
	 */
	@Test
	void Tan(){
		assertEquals(Math.tan(30),StandardFunctions.TrigonometricFunctions.Tan(30),0.05);
		assertEquals(Math.tan(90),StandardFunctions.TrigonometricFunctions.Tan(90),0.05);
		assertEquals(Math.tan(180),StandardFunctions.TrigonometricFunctions.Tan(180),0.05);
		assertEquals(Math.tan(360),StandardFunctions.TrigonometricFunctions.Tan(360),0.05);
	}
	
	
	/**
	 * Compare radians to Degrees conversion
	 */
	@Test
	void radiansToDegrees(){
		assertEquals(Math.toDegrees(57.29),StandardFunctions.TrigonometricFunctions.radiansToDegrees(57.29),0.05);
	}

}
