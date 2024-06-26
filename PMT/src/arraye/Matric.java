package arraye;

import java.util.Scanner;

public class Matric {

	public static void main(String[] args) {
		System.out.println("Ok");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row");
		int row = sc.nextInt();
		System.out.println("Enter size of col");
		int col = sc.nextInt();

		System.out.println("Enter element : ");
		int mat[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + mat[i][j];
				 System.out.print(mat[i][j] + " ");
			}
			System.out.println();

		}
		int max_col_sum = 0;
		for (int i = 0; i < row; i++) {
			int col_sum = 0;
			for (int j = 0; j < col; j++) {
				col_sum = col_sum + mat[i][j];
				if(max_col_sum<col_sum) {
					max_col_sum=col_sum;
				}
				 System.out.print(mat[i][j] + " ");
			}
		}
		System.out.println("max col sum : " +max_col_sum);

		
		int max_row_sum = 0;
		for (int i = 0; i < row; i++) {
			int row_sum = 0;
			for (int j = 0; j < col; j++) {
				row_sum = row_sum + mat[i][j];
				if(max_row_sum<row_sum) {
					max_row_sum=row_sum;
				}
				 System.out.print(mat[i][j] + " ");
			}
			System.out.println("max row sum : " +max_row_sum);
		}
		int left_dig=0,right_dig=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==j) {
					left_dig=left_dig+mat[i][j];
				}
				if(i+j==row-1) {
					right_dig=right_dig+mat[i][j];
				}
				 System.out.print(mat[i][j] + " ");
			}
			System.out.println("Sum of left Diagonal : " +left_dig);
			System.out.println("Sum of right Diagonal : " +right_dig);
		}
		
		
	}
}
