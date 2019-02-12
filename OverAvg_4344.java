package beakJoon;

import java.util.Scanner;


public class OverAvg_4344 {

	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[][] scoresInt = new int[num][1000]; 
		
		float[] sum = new float[num];
		int[] studentNum = new int[num];
		float[] overAvg = new float[num];
		float[] avg = new float[num]; // Æò±Õ°ª Ãâ·Â
		
		for(int i = 0; i < num; i++) {
			studentNum[i] = s.nextInt();
			
			for(int k = 0; k<studentNum[i]; k++) {
				scoresInt[i][k] = s.nextInt();
				sum[i] += scoresInt[i][k];
			}
		//System.out.println(sum[i]);
		avg[i] = sum[i]/studentNum[i];
		
			for(int j=0; j<studentNum[i]; j++) {
				if(avg[i] < scoresInt[i][j]){
					overAvg[i] += 1;
				}
			}
		}
		//System.out.println(avg[i]);
		//System.out.println(overAvg[i]);
	
		
		
		for(int i = 0; i < num; i++) {
			float answer = overAvg[i]/studentNum[i];
			System.out.printf("%.3f",answer*100);
			System.out.println("%");
		}
		s.close();
		
	}
	}
		
			
		

	
	



