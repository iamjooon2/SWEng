package pattern.decorator;
//P337, 코드7-28
public class WheatBread extends Toast {
	public WheatBread() {
		name.append(" 호밀식빵 토스트");
		addKcal(250);
	}
}
