package ans3;

public enum Month {
	JANUARY{
		public String giveName(){
			return"January";
		}
	},
	FEBRUARY{
		public String giveName(){
			return"February";
		}
	},
	MARCH {
		public String giveName(){
			return"March";
		}
	},
	APRIL {
		public String giveName(){
			return"April";
		}
	},
	
//		Jan.	31	winter
//	2		Feb.	28/29
//	3		Mar.	31	spring
//	4		Apr.	30
//	5		May	31
//	6		Jun.	30	summer
//	7		Jul.	31
//	8		Aug.	31
//	9		Sep.	30	autumn
//	10		Oct.	31
//	11		Nov.	30
//	12	
	
	MAY{
		public String giveName(){
			return"May";
		}
	},
	JUNE {
		public String giveName(){
			return"June";
		}
	},
	JULY {
		public String giveName(){
			return"July";
		}
	},
	AUGUST{
		public String giveName(){
			return"August";
		}
	},
	SEPTEMBER {
		public String giveName(){
			return"September";
		}
	},
	OCTOBER{
		public String giveName(){
			return"October";
		}
	},
	NOVEMBER{
		public String giveName(){
			return"November";
		}
	},
	DECEMBER {
		public String giveName(){
			return"December";
		}
	};
	public String giveName(){
		
		
		
		return"h";
	}
	
	public void printDetails() {
		System.out.print("This is the "+(this.ordinal()+1));
		if(this.ordinal()==0) {
			System.out.print("st ");
		}else if(this.ordinal()==1) {
			System.out.print("nd ");
		}
		else if(this.ordinal()==2) {
			System.out.print("rd ");
		}
		else {
			System.out.print("th ");
		}
		
		System.out.println("month of the year "+this.giveName());
	}
	
	
}






