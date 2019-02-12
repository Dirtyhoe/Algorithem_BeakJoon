package beakJoon;

import java.util.Scanner;

public class Main {
	static int[] stack = new int[10000];
	
	public static void push(int n) {
		
		if(stack[0] == 0) {
			stack[0] = n;
		}
		
		else {
		int i = 0;
		while(true) {
			
			
			
			if(stack[i] != 0) {
				i++;
			}
			else{
				stack[i] = n;
				break;
			}
		}
	}
	}
	
	public static int pop(){
		if(stack[0]==0) {
			return
		}
	}
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("ют╥б : ");
		//int numOfOrder = s.nextInt();
		push(2);
		push(4);
		push(1);
		push(5);
		
		for(int k = 0; k < 5; k++) {
			System.out.println(stack[k]);
		}
//		for(int j = 0; j < numOfOrder; j++) {
//			String order = s.next();
//			if(order == "push")
//		}
		
		s.close();
	}
}
		
			
		

	
	



