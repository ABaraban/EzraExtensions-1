package extensions.arrays;
import support.cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Number of rows?");
		int[][] array = new int[n][n];
		System.out.println("      Column");
		System.out.print("    ");
		for (int a = 0; a < n; ++a) {
			System.out.print(a + "  ");
		}
		System.out.println();
		for (int r = 0; r < n; ++r) {
			System.out.print(r + "  |");
			for (int c = 0; c < n; ++c) {
				if (c == 0) {
					array[r][c] = 1;
					System.out.print(array[r][c] + "  ");
				}
				if (r == c) {
					array[r][c] = 1;
					System.out.print(array[r][c] + "  ");
				}
				if (r < 0 || c < 0 || c > r) {
					array[r][c] = 0;
					if (array[c][r] == 0) {
						System.out.print("   ");
					}
				}
				if (r != 0 && c != 0) {
					array[r][c] = array[r - 1][c] + array[r - 1][c - 1];
					if (array[c][r] == 0) {
						System.out.print("   ");
					}
					else {
						System.out.print(array[r][c] + "  ");
					}
				}

				//if (array[c][r]!= 0){
					//System.out.print("if");
				//}



			}
			System.out.println();

		}
	}
}