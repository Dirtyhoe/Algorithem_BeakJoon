package beakJoon;


public class selfNum_4673 {

	static int nNumber(int n){
		int nNum = n;
		String sNum = Integer.toString(n);
		
		
		for(int i = 0; i <sNum.length(); i++) {
			 
			char ctemp = sNum.charAt(i); // nNum += ctemp; �ϸ� �� �̻��ϰ� ����. ��????????????????
			int itemp = Character.getNumericValue(ctemp);
			nNum += itemp;
			
		}
		
		return nNum;
	} 
//	while(n>0) { // �� ������ ���� ��
//		nNum = n%10;
//		n = n/10;
//	}
	
	public static void main(String[] args){

		Main m = new Main();
		boolean[] allNum = new boolean[10001]; // boolean �� �⺻���� false
		
		for(int j = 1; j<=10000; j++){ // ������ �ִ� ������ �ε����� true �� ����
			if(nNumber(j) <= 10000) {
				allNum[nNumber(j)] = true;
				
			}
			
		}
		
		for(int k = 1; k<=10000; k++){ // false �� �ε����� ���
			if(!allNum[k]) System.out.println(k);
			
			
		}
		
		
	}
}
		
			
		

	
	



