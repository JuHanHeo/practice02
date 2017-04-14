package prob4;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] rev= str.toCharArray();
		
		int num = str.length()/2;
		char tmp=' ';
		
		for(int i=0;i<num;i++){
			tmp = rev[i];
			rev[i] = rev[rev.length-i-1];
			rev[rev.length-i-1] = tmp;
		}
		
		return rev;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}
