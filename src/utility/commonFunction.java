package utility;

import java.util.Scanner;

public class commonFunction {

	public static int getInput() {
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	public static double lineMeasure(double pointX1,double pointX2,double pointY1,double pointY2) {
		double newLineLength=Math.sqrt(
				(Math.pow((pointX2-pointX1), 2))
				+
				(Math.pow(pointY2-pointY1, 2))
				);
		return newLineLength;
	}
	
	
}
