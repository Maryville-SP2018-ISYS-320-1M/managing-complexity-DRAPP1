

/*
	ISYS 320
	Name(s): Dave Rapp
	Date: 3-20-18
*/



public class P5_ScalableBox {
	// Here is the solution
	public static final int Sub_Height = 4;

	public static void main(String[] args) {
		drawBoxCap();
		drawBoxInsides();
		drawBoxCap();
	}
	
	public static void drawBoxCap() {
		System.out.print("+");
		
		for( int capDashIndex = 1; capDashIndex <= Sub_Height; capDashIndex++ ) {
			System.out.print("-");
		}
		
		System.out.println("+");
	}
	
	public static void drawBoxInsides() {
		for( int insideRowIndex = 1; insideRowIndex <= Sub_Height; insideRowIndex++ ) {
			drawBoxInsideLine();
		}
	}
	
	public static void drawBoxInsideLine() {
		System.out.print("|");
		
		for( int insideRowIndex = 1; insideRowIndex <= Sub_Height; insideRowIndex++ ) {
			System.out.print(".");
		}
		
		System.out.println("|");
	}

}
