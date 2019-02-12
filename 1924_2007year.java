import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		int num = 0;
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		if(a != 1) {
			for(int i = 0; i<a - 1; i++) {
				num += daysInMonth[i];
			}
			num = num + b;
		}else {
			num = b;
		}
		
		String answer = dayOfWeek[num%7];
		
		
		
		System.out.println(answer);
		
	}
}
