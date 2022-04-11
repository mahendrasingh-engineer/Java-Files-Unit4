package alarmClock;

public class AlarmClock {
	void funA(int day,boolean vacation){
		if(day>6||day<0) {
			System.out.println("error! invalid input");
		}else if(vacation&&day!=6) {
			System.out.println("10:00");
		}else if(vacation&&day==6) {
			System.out.println("off");
		}else if(!vacation&&day!=6) {
			System.out.println("7:00");
		}else if(!vacation&&day==6) {
			System.out.println("10:00");
		}
		
	}
	public static void main(String[] args) {
		AlarmClock a1=new AlarmClock();
		a1.funA(6,false);
	}
}
