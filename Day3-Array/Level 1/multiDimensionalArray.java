import java.util.Scanner;

class multiDimensionalArray{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		System.out.print("Enter number of columns: ");
		int columns = scanner.nextInt();
		
		int[][] matrix2D = new int[rows][columns];
		
		System.out.println("Enter the elements of the 2D Array: ");
		for(int i = 0;i < rows;i++){
			for(int j = 0;j < columns;j++){
				matrix2D[i][j] = scanner.nextInt();
			}
		}
		
		//To convert a 2D array into 1D array:
		
		int[] array1D = new int[rows*columns];
		
		int index = 0;
		for(int i = 0;i < rows;i++){
			for(int j = 0;j < columns;j++){
				array1D[index] = matrix2D[i][j];
				index++;
			}
		}
		
		System.out.print("1D array: ");
		for(int i = 0;i < array1D.length;i++){
			System.out.print(array1D[i]+" ");
		}
		scanner.close();
	}
}