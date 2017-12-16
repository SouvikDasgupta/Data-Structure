import java.util.Scanner;
class ZigZagArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		boolean flag = true;
		int temp = 0;
		for(int i=0; i<size-1; i++){
			if(flag){
				if(arr[i] > arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}else{
				if(arr[i] < arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			flag = !flag;
		}	

		for(int i : arr){
			System.out.print(i + " ");
		}	
	}
}