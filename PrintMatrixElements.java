import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrixElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
	
		int data[][]=new int[row][col];
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			data[i][j]	=sc.nextInt();
		}			
	}
		System.out.println("print array elements");
		System.out.println(Arrays.deepToString(data));
		for(int r[]:data) {
			for(int x:r) {
				System.out.print(x+"\\t");
			}
			System.out.println();
		}
		

}
}
