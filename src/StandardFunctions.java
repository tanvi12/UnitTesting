
public class StandardFunctions {

	static class TrigonometricFunctions{

		/******************************************************************************
		 * Compilation: javac StandardFunctions.java Execution: java Sin x
		 *
		 * Prints out sin(x) using Taylor expansion.
		 *
		 * sin x = x - x^3/3! + x^5/5! - x^7/7! + ...
		 *
		 * % java sin java Sin 0.523598775598299 0.5000000000000002
		 *
		 * Note: sin(pi/6) = sin(0.523598775598299...) = 1/2
		 *
		 *
		 ******************************************************************************/

		 static double Sin(double x) {

			double PI = 3.142;
			// convert x to an angle between -2 PI and 2 PI
			x = x % (2 * PI);

			// compute the Taylor series approximation
			double term = 1.0; // ith term = x^i / i!
			double sum = 0.0; // sum of first i terms in taylor series

			for (int i = 1; term != 0.0; i++) {
				term *= (x / i);
				if (i % 4 == 1)
					sum += term;
				if (i % 4 == 3)
					sum -= term;
			}
			return sum;
		}

		/******************************************************************************
		 * Compilation: javac StandardFunctions.java Execution: java Cos x
		 *
		 * Prints out Cos(x) using Taylor expansion.
		 *
		 * cos x = 1 - x^2/2! + x^4/4! - x^6/6! + ...
		 *
		 * % java Cos java Cos 0
		 *
		 * Note: Cos(0) = Cos(0) = 1.0
		 *
		 *
		 ******************************************************************************/

		 static double Cos(double x) {
			 double PI = 3.142;
			 x = x * (PI / 180.0);  
		      
		        double res = 1; 
		        double sign = 1, fact = 1,  
		                         pow = 1; 
		        for (int i = 1; i < 5; i++) 
		        { 
		            sign = sign * -1; 
		            fact = fact * (2 * i - 1) *  
		                               (2 * i); 
		            pow = pow * x * x; 
		            res = res + sign * pow / fact; 
		        } 
		      
		        return res;  
			
		}

		/**
		 * Find number factorial
		 * 
		 * @param num given number
		 * @return factorial of given number
		 */
		static int fac(int num) {
			if (num == 0)
				return 1;

			// To store factorial of a number
			int fact = 1;
			for (int i = 1; i <= num; i++)
				fact = fact * i;

			// Return the factorial of a number
			return fact;
		}

		/******************************************************************************
		 * Compilation: javac StandardFunctions.java Execution: java Tan x
		 *
		 * Prints out Tan(x) using Taylor expansion.
		 *
		 * tan x = x + x^3/3 + 2*x^5/15 + 17*x^7/315 + ...
		 *
		 * % java Tan java Tan 0
		 *
		 * Note: Tan(45) = Tan(45) = 1.0
		 *
		 *
		 ******************************************************************************/
		static double Tan(int x) {
			// To store value of the expansion
			double sum = 0;

			for (int i = 1; i <= 6; i += 1) {

				// This loops here calculate Bernoulli number
				// which is further used to get the coefficient
				// in the expansion of tan x
				double B = 0;
				int Bn = 2 * i;
				for (int k = 0; k <= Bn; k++) {
					double temp = 0;
					for (int r = 0; r <= k; r++)
						temp = temp + Math.pow(-1, r) * fac(k) * Math.pow(r, Bn) / (fac(r) * fac(k - r));

					B = B + temp / ((double) (k + 1));
				}
				sum = sum + Math.pow(-4, i) * (1 - Math.pow(4, i)) * B * Math.pow(x, 2 * i - 1) / fac(2 * i);
			}

			// Print the value of expansion
			return sum;
		}


		/**
		 * ConvertRadiansToDegrees
		 * @param radins value in Radians
		 * @return value in degree
		 */
		static double radiansToDegrees(double radins) {
			double PI = 3.142;
			return radins * (180/PI);
		}
	}
	public static void main(String args[]) {
		
		System.out.println("Sin values in radinas");
		System.out.println("Sin(30) "+ TrigonometricFunctions.Sin(30));
		System.out.println("Sin(90) "+ TrigonometricFunctions.Sin(90));
		System.out.println("Sin(180) "+ TrigonometricFunctions.Sin(180));
		System.out.println("Sin(270) "+ TrigonometricFunctions.Sin(270));
		System.out.println("Sin(360)"+ TrigonometricFunctions.Sin(360));
		System.out.println();
		
		System.out.println("Sin values in degree");
		System.out.println("Sin(30) "+ TrigonometricFunctions.radiansToDegrees(TrigonometricFunctions.Sin(30)));
		System.out.println("Sin(90) "+ TrigonometricFunctions.radiansToDegrees(TrigonometricFunctions.Sin(90)));
		System.out.println("Sin(180) "+ TrigonometricFunctions.radiansToDegrees(TrigonometricFunctions.Sin(180)));
		System.out.println("Sin(270) "+ TrigonometricFunctions.radiansToDegrees(TrigonometricFunctions.Sin(270)));
		System.out.println("Sin(360)"+ TrigonometricFunctions.radiansToDegrees(TrigonometricFunctions.Sin(360)));
		System.out.println();
		
		
		
		System.out.println("Cos values in radinas");
		System.out.println("Cos(30) "+ TrigonometricFunctions.Cos(30));
		System.out.println("Cos(90) "+ TrigonometricFunctions.Cos(90));
		System.out.println("Cos(180) "+ TrigonometricFunctions.Cos(180));
		System.out.println("Cos(270) "+ TrigonometricFunctions.Cos(270));
		System.out.println("Cos(360)"+ TrigonometricFunctions.Cos(360));
		System.out.println();
		
		System.out.println("Tan values in radinas");
		System.out.println("Tan(30) "+ TrigonometricFunctions.Tan(30));
		System.out.println("Tan(90) "+ TrigonometricFunctions.Tan(90));
		System.out.println("Tan(180) "+ TrigonometricFunctions.Tan(180));
		System.out.println("Tan(270) "+ TrigonometricFunctions.Tan(270));
		System.out.println("Tan(360)"+ TrigonometricFunctions.Tan(360));
		System.out.println();
	}

}