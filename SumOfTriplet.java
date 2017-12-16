import java.util.Scanner;
class SumOfTriplet{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = sc.nextInt();
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		java.util.Arrays.sort(arr);
		for(int i =0; i<size-2;i++){
			int low = i+1;
			int high = size-1;
			while(low<high){
				if(arr[i]+arr[low]+arr[high] == sum){
					System.out.println(arr[i] + " + " +arr[low] + " + "+ arr[high] + " = "+ sum);
					break;
				}else if(arr[i]+arr[low]+arr[high] < sum){
					low++;
				}else{
					high--;
				}
			}
		}
	}
}