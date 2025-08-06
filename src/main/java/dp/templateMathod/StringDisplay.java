package dp.templateMathod;

public class StringDisplay extends AbstractDisplay {
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}
	
	private void printLine () {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}

	@Override
	public void open() {
		printLine();
		
		
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
		
	}

	@Override
	public void close() {
		printLine();
		
	}
}
