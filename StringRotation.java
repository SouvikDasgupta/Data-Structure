import java.util.Scanner;
class StringRotation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		if(isRotation(s1, s2))
			System.out.println(s2 + " is rotation of " + s1);
		else
			System.out.println(s2 + " is not a rotation of " + s1);
	}

	public static boolean isRotation(String s1, String s2){
		if(s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1)
			return true;
		return false;
	}
}