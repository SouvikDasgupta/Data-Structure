import java.util.Scanner;
class ElementsHavingTwoGreater{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		java.util.Arrays.sort(arr);
		for(int i=0; i<arr.length-2; i++){
			System.out.print(arr[i] + " ");
		}
	}
}