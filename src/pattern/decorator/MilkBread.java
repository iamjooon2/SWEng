package pattern.decorator;
//P338, 코드7-30
public class MilkBread extends Toast {
	public MilkBread() {
		name.append(" 우유식빵 토스트");
		addKcal(350);
	}
}
