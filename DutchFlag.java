import java.util.Scanner;
class DutchFlag{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		int low =0;
		int mid=0;
		int high = size-1;
		int temp =0;
		while(mid<=high){
			switch(arr[mid]){
				case 0: temp = arr[low];
						arr[low] = arr[mid];
						arr[mid] = temp;
						mid++;
						low++;
						break;
				case 1: mid++;
						break;
				case 2: temp = arr[high];
						arr[high] = arr[mid];
						arr[mid] = temp;
						high--;
						break;
			}
		}

		for(int i : arr){
			System.out.print(i + " "); 
		}
		System.out.println();
	}
}