package polymorphismDemo;

public class EmailLogger extends BaseLogger{
	public void Llg(String message) {
		System.out.println("Logged to email: "+ message);
	}
}
