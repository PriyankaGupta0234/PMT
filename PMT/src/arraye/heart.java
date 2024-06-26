package arraye;

public class heart {
	    public static void main(String[] args) {
	        int n = 6;
	        for (int row = 0; row < n; row++) {
	            for (int col = 0; col <= 7; col++) {
	                if ((row == 0 && col % 3 != 0) || (row == 1 && col % 3 == 0) || (row - col == 2) || (row + col == 8)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
