package ans4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ans4 a=Child.makeObj(3);
		Child c=(Child)a;
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		System.out.println("calling from parent reference");
		a.method1();
		a.method2();
		a.method3();
	}

}
