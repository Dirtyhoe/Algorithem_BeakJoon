package beakJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bufferd {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 콘솔입력을 위한 객체 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 입력받은 문자를 스트링으로 받아와 토크나이저에 저장
		
		try {
		System.out.println("Input numbers");
		int T = Integer.parseInt(br.readLine());// 엔터를 칠때까지 입력을 받아서 사용할 수 있게끔 똑 떼놓음. string to int
		
		for(int i = 0; i < T; i++){
			System.out.println("Input two numbers");
			String num = br.readLine();
			String[] nums = num.split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			bw.write(a + b + "\n");
			bw.flush();
		
			//StringTokenizer st = new StringTokenizer(br.readLine()); // 앤터칠때까지 입력 받아서 스트링토크나이져에 저장
//			int a = Integer.parseInt(st.nextToken()); 
//			int b = Integer.parseInt(st.nextToken());
		}
			
		}catch(IOException e) {
			
		}
	}

}
