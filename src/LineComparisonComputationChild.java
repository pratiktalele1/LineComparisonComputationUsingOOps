import java.util.logging.Level;
import java.util.logging.Logger;

public class LineComparisonComputationChild extends LineComparisonComputationParent {

	public static final Logger logger=Logger.getLogger("LineComparisonComputationParent");
	
	//calculating length of line
	public void LengthOfLine() {
		System.out.println("------------------------------");
		logger.log(Level.INFO,"length of line is - "+
				Math.sqrt(
						(Math.pow((pointX2-pointX1), 2))
						+
						(Math.pow(pointY2-pointY1, 2))
						)
				);
		System.out.println("------------------------------");
	}
	
}
