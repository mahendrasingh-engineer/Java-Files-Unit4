package scheduleOfWeek;

class ScheduleOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assume this can have any value from 1 to 7:
		int dayOfWeek = 6;
		String schedule;
		//TODO: declare a String variable called schedule.
		//TODO: write a switch statement that give schedule a different
		//value for each day of the week based on the dayOfWeek variable.
		//Don’t forget to "break" after each case, and don’t forget to
		//provide a default case!
		
		switch (dayOfWeek) {
		case 1: {
			schedule="Gym in the morning.";
			break;
		}
		case 2: {
			schedule="Class after work.";
			break;
		}
		case 3: {
			schedule="Meetings all day.";
			break;
		}
		case 4: {
			schedule="Work from home.";
			break;
		}
		case 5: {
			schedule="Game night after work.";
			break;
		}
		case 6: {
			schedule="Free!";
			break;
		}
		case 7: {
			schedule="Free!";
			break;
		}
		default:
			schedule="error! invalid input(seems like you want to invent a new day)";
		}
		System.out.println(schedule);
	}
	

}
/*For Monday, give it the value "Gym in the morning." 
 * For Tuesday give it the value "Class after work."
 *  For Wednesday, give it the value "Meetings all day." 
 *  For Thursday give it the value "Work from home." 
 *  For Friday, give it the value "Game night after work."
 *   For Saturday and Sunday, give it the value "Free!" */
