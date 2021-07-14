
public class LineComparisonComputation {

	public static void main(String[] args) {
		
		//generating object for child class
		LineComparisonComputationChild lineMeasureMent=new LineComparisonComputationChild();
		
		//calling function for Uc1
		lineMeasureMent.LengthOfLine();
		
		//checking for equality of two line
		lineMeasureMent.equalLength();
		
		//comparing length of two lines
		lineMeasureMent.compareLength();
	}
}
