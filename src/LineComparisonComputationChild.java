import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import utility.commonFunction;

public class LineComparisonComputationChild extends LineComparisonComputationParent {

	public static final Logger logger=Logger.getLogger("LineComparisonComputationParent");
	
	//calculating length of line
	public void LengthOfLine() {
		System.out.println("------------------------------");
		logger.log(Level.INFO,"length of line is - "+
				commonFunction.lineMeasure(pointX1, pointX2, pointY1, pointY2));
		System.out.println("------------------------------");
	}
	
	// checking for equal length of two line
	public void equalLength() {
		
		System.out.println("----------------------------------");
		//getting X1 point
		logger.log(Level.INFO,"Enter line x1 cordinate- ");
		super.pointX1 =commonFunction.getInput(); 
		System.out.println("----------------------------------");
		//getting X2 point
		logger.log(Level.INFO,"Enter line x2 cordinate- ");
		super.pointX2 =commonFunction.getInput(); 
		System.out.println("----------------------------------");
		//getting Y1 point
		logger.log(Level.INFO,"Enter line y1 cordinate- ");
		super.pointY1 =commonFunction.getInput(); 
		System.out.println("----------------------------------");
		//getting Y2 point
		logger.log(Level.INFO,"Enter line y2 cordinate- ");
		super.pointY2 =commonFunction.getInput(); 

		//getting line length
		 newLineLength=commonFunction.lineMeasure(pointX1, pointX2, pointY1, pointY2);
		
		
		getUserInput=newLineLength+"";
		getLength=lineLength+"";
		
		boolean checkEquality=getUserInput.equals(getLength);
		
		//checking for equality
		if(checkEquality) {
			System.out.println("both line length are equal");
		}else {
			System.out.println("both line length are different");
		}
		
		
	}

	//comparing length of two line
	public void compareLength() {
		
		//first line input
		logger.log(Level.INFO,"Enter 1st line cordinate- ");
		logger.log(Level.INFO,"Enter line x1 cordinate- ");
		pointX1 = commonFunction.getInput();
		
		logger.log(Level.INFO,"Enter line x2 cordinate- ");
		pointX2 = commonFunction.getInput();
		
		logger.log(Level.INFO,"Enter line y1 cordinate- ");
		pointY1 = commonFunction.getInput();
		
		logger.log(Level.INFO,"Enter line y2 cordinate- ");
		pointY2 = commonFunction.getInput();
		
		// using Math.pow and Math.sqrt method
		 double firstLineLength=commonFunction.lineMeasure(pointX1, pointX2, pointY1, pointY2);
		//type casting from double to string 
		String getUser1Input=firstLineLength+"";
		
		//second line input
		logger.log(Level.INFO,"Enter 2nd line cordinate- ");
		logger.log(Level.INFO,"Enter line x1 cordinate- ");
		pointX1 = commonFunction.getInput();
		
		logger.log(Level.INFO,"Enter line x2 cordinate- ");
		pointX2 = commonFunction.getInput();
		
		logger.log(Level.INFO,"Enter line y1 cordinate- ");
		pointY1 = commonFunction.getInput();	
		
		logger.log(Level.INFO,"Enter line y2 cordinate- ");
		pointY2 = commonFunction.getInput();
		
		// using Math.pow and Math.sqrt method
		 double secondLineLength=commonFunction.lineMeasure(pointX1, pointX2, pointY1, pointY2);
		//type casting from double to string 
		String getUser2Input=secondLineLength+"";
		
		//compareTo method
		double firstValue=(getUser1Input.compareTo(getUser2Input));
		double secondValue=(getUser2Input.compareTo(getUser1Input));
		
		System.out.println("--------------------------------------");

		if(firstValue>secondValue) {
			System.out.println("first line is greater");
		}
		else { 
			if(firstValue<secondValue){
			System.out.println("second line is greater");
			}else {
				System.out.println("both first and second lines are equal");
			}
		}
		System.out.println("--------------------------------------");

	}
	
}
