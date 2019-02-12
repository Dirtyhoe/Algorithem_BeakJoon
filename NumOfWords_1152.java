package beakJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumOfWords_1152 {

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		try {
			
			
			int numOfwords = 0;
			
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String arr = st.nextToken(); // nextElement ¶û Â÷ÀÌ ???????????/
				System.out.println(arr);
				numOfwords++;
			}
			
//			String example = br.readLine();
//			String[] arr = example.split(" ");
//			for(int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i]);
//				if(arr[i].length() != 0) {
//				numOfwords++;
//			}
//			}
			
			
			
			System.out.println(numOfwords);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
		
			
		

	
	



