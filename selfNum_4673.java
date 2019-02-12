package beakJoon;


public class selfNum_4673 {

	static int nNumber(int n){
		int nNum = n;
		String sNum = Integer.toString(n);
		
		
		for(int i = 0; i <sNum.length(); i++) {
			 
			char ctemp = sNum.charAt(i); // nNum += ctemp; 하면 값 이상하게 나옴. 왜????????????????
			int itemp = Character.getNumericValue(ctemp);
			nNum += itemp;
			
		}
		
		return nNum;
	} 
//	while(n>0) { // 위 포문과 같은 것
//		nNum = n%10;
//		n = n/10;
//	}
	
	public static void main(String[] args){

		Main m = new Main();
		boolean[] allNum = new boolean[10001]; // boolean 의 기본값은 false
		
		for(int j = 1; j<=10000; j++){ // 생성자 있는 값들의 인덱스를 true 로 변경
			if(nNumber(j) <= 10000) {
				allNum[nNumber(j)] = true;
				
			}
			
		}
		
		for(int k = 1; k<=10000; k++){ // false 인 인덱스만 출력
			if(!allNum[k]) System.out.println(k);
			
			
		}
		
		
	}
}
		
			
		

	
	



