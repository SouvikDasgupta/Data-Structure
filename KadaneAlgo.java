import java.util.Scanner;
class KadaneAlgo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int maxSoFar = arr[0];
		int maxEndingHere = 0;
		int start = 0;
		int end = 0;
		int search = 0;
		for(int i=0; i<size; i++){
			maxEndingHere = maxEndingHere + arr[i];
			if(maxSoFar < maxEndingHere){
				maxSoFar = maxEndingHere;
				start = search;
				end = i;
			}

			if(maxEndingHere < 0){
				maxEndingHere = 0;
				search = i+1;
			}
		}

		for(int i=start; i<=end; i++){
			System.out.print(arr[i] + " ");
		}
	}
}