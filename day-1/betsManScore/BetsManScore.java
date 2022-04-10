package betsManScore;

public class BetsManScore {
	
	static int totalRun=0;
	static void calFun(int r1,int r2,int r3,int r4,int r6) {
		totalRun=totalRun+r1+r2+r3+r4+r6;
		System.out.print("total runs: ");
		System.out.println(totalRun);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetsManScore.calFun(2, 2, 3, 4, 4);
	}

}
