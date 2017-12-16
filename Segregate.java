import java.util.Scanner;
class Segregate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		java.util.Arrays.sort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}