import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
class ReverseFirstKElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter the values in the list");
		for(int i=0; i<size; i++){
			list.add(sc.nextInt());
		}

		System.out.println("Enter size of reverse list");
		int k = sc.nextInt();
		for(int i =k-1; i>=0; i--){
			System.out.print(list.get(i) + " ");
		}
	}
}