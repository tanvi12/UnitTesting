
public class StandardFunctions {

    public static void main(String[] args) {
        System.out.println("hello");
    }


    /******************************************************************************
     *  Compilation:  javac StandardFunctions.java
     *  Execution:    java Sin x
     *
     *  Prints out sin(x) using Taylor expansion.
     *
     *     sin x = x - x^3/3! + x^5/5! - x^7/7! + ...
     *
     *  % java sin  java Sin 0.523598775598299
     *  0.5000000000000002
     *
     *  Note:  sin(pi/6) = sin(0.523598775598299...) = 1/2
     *
     *
     ******************************************************************************/

    static double Sin(double x){

        return 0;
    }


    /******************************************************************************
     *  Compilation:  javac StandardFunctions.java
     *  Execution:    java Cos x
     *
     *  Prints out Cos(x) using Taylor expansion.
     *
     *     cos x = 1 - x^2/2! + x^4/4! - x^6/6! + ...
     *
     *  % java Cos  java Cos 0
     *
     *  Note:  Cos(0) = Cos(0) = 1.0
     *
     *
     ******************************************************************************/

    static double Cos(double x)
    {


        return 0;
    }



    /******************************************************************************
     *  Compilation:  javac StandardFunctions.java
     *  Execution:    java Tan x
     *
     *  Prints out Tan(x) using Taylor expansion.
     *
     *     tan x = x + x^3/3 + 2*x^5/15 + 17*x^7/315 + ...
     *
     *  % java Tan  java Tan 0
     *
     *  Note:  Tan(45) = Tan(45) = 1.0
     *
     *
     ******************************************************************************/
    static double Tan( int x)
    {


        return 0;
    }

    /***************************
     *
     * @param radians Radian number
     * @return radians to degrees
     */
    public static double radiansToDegrees(double radians) {
        return 0;
    }

}

