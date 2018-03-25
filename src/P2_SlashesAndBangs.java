/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 2.) Create a table below (just using text) that outlines your analysis of the figure. 
 * That is, how many of each character on each line? What expression captures the relationship 
 * between the line number and how many of the character is printed on each line? Choose your 
 * headings based on how you can break down the figure.
LN| (!) (\) (/)
1 | 22   0   0
2 | 18   2   2
3 | 14   4   4
4 | 10   6   6
5 | 06   8   8
6 | 02   10  10
*/

/* 3.) Using your analysis from above, in pseudocode describe the algorithm for how to draw 
 * the figure.
 
 for (int slash = 1; slash <= (2 * line - 2); slash++) {
				System.out.println("/");
--------------------------------------------------------------------------------------				
for (int ex = 1; ex <= (-4 * line + 26); ex++)
				System.out.print("!");				
--------------------------------------------------------------------------------------

 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		int height=6;
		SlashFigure obj= new SlashFigure();
		obj.drawSlashFigure();
	}
	public void drawSlashFigure() {
		for (int row = 0; row < height; row ++) {
			for (int i = 1; i <= row; i ++) {
				System.out.print("\\\\");
			}
			for (int col = (height - row) *4 - 2; col > 0; col--) {
				System.out.print("!");
			}
			for (int j = 1; j <= row; j++) {
				System.out.print("//");
			}
			System.out.println();
		}
	}
}
