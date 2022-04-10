package naturalNumber;

public class NaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Nature.sumOfN(10));
	}

}
class Nature{
	static int sumOfN(int n) {
		int sum=(n*(n+1))/2;
		return sum;
	}
}
