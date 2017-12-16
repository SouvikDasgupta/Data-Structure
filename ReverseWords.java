import java.util.Scanner;
class ReverseWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("\\s");
		for(int i=arr.length-1; i>=0;i--){
			System.out.print(arr[i] + " ");
		}
	}
}