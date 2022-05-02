package ans2;

public class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		super("Age should not be in the future ");
	}
}
