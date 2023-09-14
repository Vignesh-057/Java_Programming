package Problems1;

public class SnakeMatrix {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int rowst = 0;
		int rowend = a.length;
		int colst = 0;
		int colend = a[0].length;
		while (rowst < rowend) {
			for (int i = colst; i < colend; i++) {
				System.out.print(a[rowst][i] + " ");
			}
			rowst += 1;
			if (rowst < rowend) {
				for (int i = colend - 1; i >= colst; i--) {
					System.out.print(a[rowst][i] + " ");
				}
				rowst += 1;
			}
		}
	}

}
