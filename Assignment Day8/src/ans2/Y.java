package ans2;

public interface Y {
	abstract void onea();
	default void onedy() {
		System.out.println("inside default of Y interface");
	}
	
	
	static void ones() {
		System.out.println("inside the static of y interface");
	}
}
