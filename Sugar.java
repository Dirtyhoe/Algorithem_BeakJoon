package beakJoon;

import java.util.Scanner;


public class Sugar {

	
	public static void main(String[] args){

		System.out.print("���ڸ� �Է��Ͻÿ� : ");

		Scanner s = new Scanner(System.in);
		int sugar = s.nextInt();
		int five = 5, three = 3, num = 0;
		
		int i = sugar/five;
		
		while(i >= 0) {
			
			int rest = sugar - five*i;
			if(rest%three == 0) { // �������� 3���� ������ �������� ���
				num = i + rest/three;
				break;			
			}else if(rest==0) { //5�� ����������°��
				num = i;
				break;	
			}else if(i == 0 & rest%three != 0) { // ��� i����� �� ���� ���� �ȵǴ¾ֵ�(���������)
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
		
			
		

	
	



