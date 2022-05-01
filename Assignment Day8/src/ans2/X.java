package ans2;

public interface X {
	abstract void onea();
	default void oned() {
		System.out.println("inside default of x interface");
	}
	
	
	static void ones() {
		System.out.println("inside static of x interface");
	}
}
