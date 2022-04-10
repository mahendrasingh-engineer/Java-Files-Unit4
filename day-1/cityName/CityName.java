package cityName;

public class CityName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintForName.fun("Mumbai");
	}

}
class PrintForName{
	static void fun(String cityName) {
		switch (cityName) {
		case "Mumbai": {
			System.out.println("Financial city");
			break;
		}
		case "Kolkata": {
			System.out.println("City of Joy");
			break;
		}
		case "Delhi": {
			System.out.println("Capital of the country");
			break;
		}
		case "Bangalore": {
			System.out.println("Cyber City");
			break;
		}
		default:
			System.out.println("May be Other Indian City");
		}
	}
}

/*if city.equals("Mumbai") then print
	"Financial city"
if city.equals("Kolkata") then print
	"City of Joy"
if city.equals("Delhi") then print
	"Capital of the country"
if city.equals("Bangalore") then print
	"Cyber City"
otherwise
	"May be Other Indian City"*/
