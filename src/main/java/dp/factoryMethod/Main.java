package dp.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("김영삼");
		Product card2 = factory.create("김대중");
		card1.use();

	}

}
