package pattern.decorator;
//P339, 코드7-34
public class Cheese extends ToppingDecorator {
	public String Name() {
		return "치즈";
	}
	public int Kcal() {
		return 50;
	}
}
