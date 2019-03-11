package Day4;

public class Junit02 {
	public int xxx(int x) {
		int k = 0;
		if(x%10==0) {
			k=x;
			
		}
		else {
			System.out.println("这个数不能被10整除");
		}
		return k;
		
	}
	public int yyy(int x) {
		int kk = 0;
		if(x%7==0) {
			kk=x;
			
		}
		else {
			System.out.println("这个数不能被7整除");
		}
		return kk;
	}

}
