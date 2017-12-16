import java.util.Scanner;
class LongestPallindromicSubsequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[][] result = new int[str.length()][str.length()];
		for(int i=0; i<str.length();i++){
			result[i][i] = 1;
		}

		for(int l =2; l<=str.length(); l++){
			for(int i=0; i<str.length()-l+1;i++){
				int j = i+l-1;
				if(l==2 && str.charAt(i)==str.charAt(j)){
					result[i][j] = 2;
				}
				else if(str.charAt(i)==str.charAt(j)){
					result[i][j] = 2+ result[i+1][j-1];
				}else{
					result[i][j] = Math.max(result[i+1][j], result[i][j-1]);
				}
			}
		}

		System.out.println("Longest pallindrome" + result[0][str.length()-1]);
	}
}