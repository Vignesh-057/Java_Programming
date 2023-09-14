package Problems;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = sc.nextInt();
		System.out.println("Enter col: ");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
