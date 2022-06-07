package pattern.decorator;

public class Ham extends ToppingDecorator {
	public String Name() {
		return "햄";
	}
	public int Kcal() {
		return 200;
	}
}
