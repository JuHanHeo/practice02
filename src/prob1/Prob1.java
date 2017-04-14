package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] cnt = new int[unit.length];
		int money = 0;
		
		System.out.print("금액 : ");
		Scanner scan = new Scanner(System.in);
		money = scan.nextInt();
		
		for(int i=0;i<unit.length;i++){
			cnt[i] = money/unit[i];
			money = money%unit[i];
			System.out.println(unit[i]+"원 : "+cnt[i]+"개");
		}
		
		scan.close();
		
		
		
		
		
		
	}
}