import java.util.Scanner;
class MinimumDiff{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		java.util.Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++){
			int diff = java.lang.Math.abs(arr[i+1] - arr[i]);
			if(diff< min){
				min = diff;
			}
		}

		System.out.println("Minimum value " + min);
	}
}