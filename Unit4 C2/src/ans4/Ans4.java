package ans4;

public abstract class Ans4 {
	final int number;
	abstract void method1();
	final void method2(){
		System.out.println("inside parent");
	}
	final void method3(){
		System.out.println("inside parent");
	}
	public Ans4(int number) {
		super();
		this.number = number;
	}
	
}
final class Child extends Ans4{
	void method4() {
		
	}
	private Child(int i) {
		super(i);
	}
	public static Child makeObj(int i) {
		if(i>0&&i<=10) {
			return new Child(i);
		}
		System.out.println("Invalid number”");
		return null;
	}
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("inside child");
		System.out.println(number);
	}
}