package pattern.decorator;
//P337, 코드7-29
public class NormalBread extends Toast {
	public NormalBread() {
		name.append(" 식빵 토스트");
		addKcal(300);
	}
}
