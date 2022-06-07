package pattern.decorator;

public class Egg extends ToppingDecorator {
	public String Name() {
		return "계란";
	}
	public int Kcal() {
		return 100;
	}
}
