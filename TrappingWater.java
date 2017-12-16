import java.util.Scanner;
class TrappingWater{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[] left = new int[size];
		int[] right = new int[size];
		int waterTrapped = 0;
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		left[0] = arr[0];
		right[size-1] = arr[size-1];
		for(int i=1; i<size; i++){
			left[i] = Math.max(left[i-1], arr[i]);
		}

		for(int i=size-2; i>=0;i--){
			right[i] = Math.max(right[i+1], arr[i]);
		}

		for(int i=0;i<size;i++){
			waterTrapped += Math.min(left[i], right[i]) - arr[i];
		}

		System.out.println("Trapped water:" + waterTrapped);

	}
}