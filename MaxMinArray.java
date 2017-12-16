import java.util.Scanner;
class MaxMinArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		int[] temp = new int[size];
		int small = 0;
		int large = size-1;
		boolean flag = true;
		for(int i=0; i<size; i++){
			if(flag){
				temp[i] = arr[large--];
			}else{
				temp[i] = arr[small++];
			}
			flag = !flag;
		}

		for(int i : temp){
			System.out.print(i + " ");
		}
	}
}