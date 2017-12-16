import java.util.Scanner;
class ArraySubsetSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int sum = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		java.util.Arrays.sort(arr);
		int low = 0;
		int high = size-1;
		while(low<high){
			if(arr[low] + arr[high] == sum){
				System.out.println(arr[low] + " + " + arr[high] + " = "+sum);
				low++;
				high--;
				// break;
			}else if(arr[low]+arr[high]<sum){
				low++;
			}else{
				high--;
			}
		}
	}
}