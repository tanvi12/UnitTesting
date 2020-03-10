import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
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
	 * Check function output not null
	 */
	@Test
	void SinNotNull(){
		assertNotNull(StandardFunctions.TrigonometricFunctions.Sin(30));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Sin(90));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Sin(180));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Sin(360));
	}
	
	/**
	 * Check function output not null
	 */
	@Test
	void CosNotNull(){
		assertNotNull(StandardFunctions.TrigonometricFunctions.Cos(30));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Cos(90));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Cos(180));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Cos(360));
	}
	
	
	/**
	 * Compare Math and Taylor series output
	 */
	@Test
	void Cos(){
		assertEquals(Math.cos(StandardFunctions.TrigonometricFunctions.degressToRadians(30)),StandardFunctions.TrigonometricFunctions.Cos(30),0.05);
		assertEquals(Math.cos(StandardFunctions.TrigonometricFunctions.degressToRadians(90)),StandardFunctions.TrigonometricFunctions.Cos(90),0.05);
		assertEquals(Math.cos(StandardFunctions.TrigonometricFunctions.degressToRadians(180)),StandardFunctions.TrigonometricFunctions.Cos(180),0.05);
		assertEquals(Math.cos(StandardFunctions.TrigonometricFunctions.degressToRadians(360)),StandardFunctions.TrigonometricFunctions.Cos(360),0.05);
	}
	
	/**
	 * Compare Math and Taylor series output
	 */
	@Test
	void Tan() throws Exception{
		
		assertEquals(Math.tan(StandardFunctions.TrigonometricFunctions.degressToRadians(30)),StandardFunctions.TrigonometricFunctions.Tan(30),0.11);
		assertEquals(Math.tan(StandardFunctions.TrigonometricFunctions.degressToRadians(180)),StandardFunctions.TrigonometricFunctions.Tan(180),0.90);
		assertEquals(Math.tan(StandardFunctions.TrigonometricFunctions.degressToRadians(360)),StandardFunctions.TrigonometricFunctions.Tan(360),0.90);
	}
	
	
	/**
	 * Compare Math and Taylor series output
	 */
	
	void TanInvalidInputs() throws Exception{
		
		StandardFunctions.TrigonometricFunctions.Tan(270);
		StandardFunctions.TrigonometricFunctions.Tan(90);
	}
	
	/**
	 * Check function output not null
	 */
	@Test
	void TanNotNull() throws Exception{
		assertNotNull(StandardFunctions.TrigonometricFunctions.Tan(30));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Tan(180));
		assertNotNull(StandardFunctions.TrigonometricFunctions.Tan(360));
	}
	
	/**
	 * Compare radians to Degrees conversion
	 */
	@Test
	void radiansToDegrees(){
		assertEquals(Math.toRadians(57.29),StandardFunctions.TrigonometricFunctions.degressToRadians(57.29),0.5);
	}

}
