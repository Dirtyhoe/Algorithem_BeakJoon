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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// �ܼ��Է��� ���� ��ü ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// �Է¹��� ���ڸ� ��Ʈ������ �޾ƿ� ��ũ�������� ����
		
		try {
		System.out.println("Input numbers");
		int T = Integer.parseInt(br.readLine());// ���͸� ĥ������ �Է��� �޾Ƽ� ����� �� �ְԲ� �� ������. string to int
		
		for(int i = 0; i < T; i++){
			System.out.println("Input two numbers");
			String num = br.readLine();
			String[] nums = num.split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			bw.write(a + b + "\n");
			bw.flush();
		
			//StringTokenizer st = new StringTokenizer(br.readLine()); // ����ĥ������ �Է� �޾Ƽ� ��Ʈ����ũ�������� ����
//			int a = Integer.parseInt(st.nextToken()); 
//			int b = Integer.parseInt(st.nextToken());
		}
			
		}catch(IOException e) {
			
		}
	}

}
