package pattern.decorator;
//P339, 코드7-33
public class Vegetable extends ToppingDecorator {
	@Override
	public String Name() {
		return "야채";
	}
	@Override
	public int Kcal() {
		return 10;
	}
}
