package ans4;

public class Odd {
	static void fun(long n) {
		if(n%2==0) {
			System.out.println(n+(10-(n%10)));
		}else {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		fun(44);
		fun(45);
	}
}
