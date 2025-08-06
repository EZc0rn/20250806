package dp.templateMathod;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('H');
		d1.display();
		
		d1 = new StringDisplay("Hello");
		d1.display();
	}

}
