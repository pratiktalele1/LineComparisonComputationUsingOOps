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
	
}
