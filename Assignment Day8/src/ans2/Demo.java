package ans2;

public class Demo implements Z {

	@Override
	public void onea() {
		// TODO Auto-generated method stub
		System.out.println("inside implemented interface method x,y");
	}

	@Override
	public void onez() {
		// TODO Auto-generated method stub
		System.out.println("inside implemented interface method zz");
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
		d.onea();
		d.oned();
		d.onedy();
		Y.ones();
		X.ones();
	}

}
