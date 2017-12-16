import java.util.Scanner;
class CommonInThreeArr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		int[] arr3 = new int[size3];

		insertElementsInArray(arr1, sc);
		insertElementsInArray(arr2, sc);
		insertElementsInArray(arr3, sc);
		printCommonElements(arr1, arr2, arr3);

	}

	public static void insertElementsInArray(int[] arr, Scanner sc){
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	}

	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void printCommonElements(int[] arr1, int[] arr2, int[] arr3){
		int i=0;
		int j=0;
		int k=0;
		while(i< arr1.length && j<arr2.length && k<arr3.length){
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
			}else if(arr1[i]<arr2[j]){
				i++;
			}else if(arr2[j]<arr3[k]){
				j++;
			}else{
				k++;
			}
		}
	}
}