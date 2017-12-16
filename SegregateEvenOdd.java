import java.util.Scanner;
class SegregateEvenOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int left = 0;
		int right = size-1;
		while(left < right){
			while(arr[left]%2 == 0 && left<right){
				left++;
			}
			while(arr[right]%2==1 && left<right ){
				right--;
			}
			if(left<right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				right--;
				left++;
			}
		}

		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}