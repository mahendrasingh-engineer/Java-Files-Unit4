package primeFactor;

public class PrimeFactor {
	static void primeFactor(int n){
		if(n>100) {
			System.out.println("Invalid number");
			return;
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i);
				System.out.print(", ");
			}
		}
	}
	public static void main(String[] args) {
		PrimeFactor.primeFactor(12);
	}
}
