package dp.templateMathod;

public class CharDisplay extends AbstractDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		super();
		this.ch = ch;
	}
	@Override
	public void open() {
		System.out.println("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}

}
