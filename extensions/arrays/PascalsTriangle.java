package extensions.arrays;
import support.cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int entry = 0;
		int n = ap.nextInt("Number of rows?");
		int[][] array = new int[n][n];
		System.out.println("          Column");
		System.out.print("       ");
		for (int a = 0; a < n; ++a) {
			System.out.print(a + "    ");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------");
		for (int r = 0; r < n; ++r) {
			if (r<10) {
				System.out.print(r + "   |");
			}
			else {
				System.out.print(r + "  |");
			}
			for (int c = 0; c < n; ++c) {
				if (c == 0) {
					array[r][c] = 1;
					entry = array[r][c];
					if (entry < 10) {
						System.out.print("  " + array[r][c] + "  ");
					}
				}
//				if (r == c) {
//					array[r][c] = 1;
//					entry = array[r][c];
//					if (entry < 10 && entry !=0) {
//						System.out.print("  " + array[r][c] + "  ");
//					}
			//}
				if (r < 0 || c < 0 || c > r) {
					array[r][c] = 0;
					//entry = array[r][c];
						//if (array[r][c] == 0)
							System.out.print("     ");


				}
				if (r != 0 && c != 0) {
					array[r][c] = array[r - 1][c] + array[r - 1][c - 1];
					entry = array[r][c];
					if (entry < 10) {
						if (array[r][c] == 0) {
							System.out.print("     ");
						}
						else {
							System.out.print("  " + array[r][c] + "  ");
						}
					}
					if (entry <100 && entry >=10) {
						if (array[r][c] == 0) {
							//System.out.println("r,c"+array[r][c]);
							System.out.print("     ");
						}
						else {
							System.out.print(" " + array[r][c] + "  ");
						}
					}
					else {
						if (entry > 100) {
							if (array[r][c] == 0 || array[r][c] == 1) {
								//System.out.println("r,c"+array[r][c]);
								System.out.print("     ");
							} else
								System.out.print(array[r][c] + "  ");
						}
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