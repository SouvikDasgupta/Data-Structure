import java.util.Scanner;
class RotateMatrix90{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i=0;i<size; i++){
			for(int j=0;j<size; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Before Rotation");
		printArray(arr);
		transpose(arr);
		System.out.println("After Tranpose");
		printArray(arr);
		System.out.println("After Rotation");
		reverseColumn(arr);
		printArray(arr);

	}

	public static void printArray(int arr[][]){
		for(int i=0; i<arr[0].length; i++){
			for(int j=0;j<arr.length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void transpose(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				int temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;
			}
		}
	}

	public static void reverseColumn(int arr[][]){
		for(int i=0; i<arr.length;i++){
			for(int j=0, k=arr.length-1; j<k; j++,k--){
				int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
			}
		}
	}
}