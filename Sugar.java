package beakJoon;

import java.util.Scanner;


public class Sugar {

	
	public static void main(String[] args){

		System.out.print("숫자를 입력하시오 : ");

		Scanner s = new Scanner(System.in);
		int sugar = s.nextInt();
		int five = 5, three = 3, num = 0;
		
		int i = sugar/five;
		
		while(i >= 0) {
			
			int rest = sugar - five*i;
			if(rest%three == 0) { // 나머지가 3으로 나누어 떨어지는 경우
				num = i + rest/three;
				break;			
			}else if(rest==0) { //5로 나누어떨어지는경우
				num = i;
				break;	
			}else if(i == 0 & rest%three != 0) { // 모든 i경우의 수 실행 이후 안되는애들(마지막경우)
					num = -1;
					break;
			}else {
				i--;
				continue;
			}
			
			
		}
		System.out.println(num);
		
		
		s.close();
	}
	}
		
			
		

	
	



