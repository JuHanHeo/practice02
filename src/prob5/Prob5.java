package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		int cnt = 1;
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int min=1;
		int max=100;
		int tmp=0;

		while(true){
			if(cnt==1){
				System.out.println("수를 결정하였습니다. 맞추어 보세요.");
				num = r.nextInt(100) + 1;
				System.out.println(num);
			}
			System.out.println(min+"-"+max);
			System.out.print(cnt+">>");
			tmp = scan.nextInt();
			cnt++;

			if(num == tmp){
				cnt=1;
				min = 1;
				max=100;

				System.out.println("맞았습니다");
				System.out.println("다시하시겠습니까(y/n)");
				if(scan.next().equals("n")){
					break;
				}
				else{
					cnt=1;
				}
			}
			else if(tmp > num){
				System.out.println("더 낮게");
				if(max>=tmp){
					max = tmp;
				}
			}
			else{
				System.out.println("더 높게");
				if(min<=tmp){
					min = tmp;
				}
			}

		}
		scan.close();

	}

}