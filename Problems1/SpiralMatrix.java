package Problems1;

import java.util.ArrayList;

public class SpiralMatrix {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int row1 = sc.nextInt();
//		int col1 = sc.nextInt();
//		int a[][] = new int[row1][col1];
//		for(int i=0;i<row1;i++) {
//			for(int j=0;j<col1;j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

//		= [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

//		int a[][] = { { 1,   2,  3, 4 },
//                { 14, 15, 16, 5 },
//                { 13, 20, 17, 6 },
//                { 12, 19, 18, 7 },
//                { 11, 10, 9,  8 }};
		ArrayList<Integer> al = new ArrayList<>();

		int rowst = 0;
		int rowend = a.length;
		int colst = 0;
		int colend = a[0].length;
		while (rowst <= rowend && colst <= colend) {

			for (int col = colst; col < colend; col++) {
				al.add(a[rowst][col]);

			}
			rowst++;
			for (int row = rowst; row < rowend; row++) {
				al.add(a[row][colend - 1]);

			}
			colend--;
			if (rowst < rowend) {
				for (int col = colend - 1; col >= colst; col--) {
					al.add(a[rowend - 1][col]);

				}
				rowend--;
			}
			if (colst < colend) {
				for (int row = rowend - 1; row >= rowst; row--) {
					al.add(a[row][colst]);

				}
				colst++;
			}
		}
		
		 System.out.println(al);
		 for(int i:al) {
			System.out.print(i+ " ");
		}
	}
}