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
 
 // loop for slashes..
  * for (2 * line - 2); slash++ 
		System.out.println("//");
--------------------------------------------------------------------------------------				
// loop for exclamation points..
 * for (-4 * line + 26); exclamation++
		System.out.print("!");				
--------------------------------------------------------------------------------------
Also I think the canvas assignment had the slashes on the right side mixed up. I went with the way
the book had it assigned. I could not decide whether to follow canvas or the book?

 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		int height = 6;
		P2_SlashesAndBangs.drawP2_SlashesAndBangs();
	

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


	private static void drawP2_SlashesAndBangs() {
		// TODO Auto-generated method stub

	}
}