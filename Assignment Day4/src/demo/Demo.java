package demo;

public class Demo {
	
// constructors
	 Demo(){
		 this("1");
		 System.out.println("Demo()");
		 
	 }
	 
	Demo(String s){
		this(1);
		 System.out.println("Demo(String s)");
		 
	 }
	 Demo(int i){
			this(1f);
		 System.out.println("Demo(int i)");
	 }
	 Demo(float f){
		 System.out.println("Demo(float f)");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
	}

}
