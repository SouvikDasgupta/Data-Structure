import java.util.Scanner;
class KthGreatMinElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		java.util.Arrays.sort(arr);
		int k = sc.nextInt();
		String operation = sc.next();
		if(operation.equals("greatest")){
			System.out.println(arr[arr.length-k] + " ");
		}else if(operation.equals("min")){
			System.out.println(arr[k-1] + " ");
		}
	}
}