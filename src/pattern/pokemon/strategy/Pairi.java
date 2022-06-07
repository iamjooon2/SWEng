package pattern.pokemon.strategy;
//P320, 코드7-7
public class Pairi extends Pokemon {
	public Pairi() {
		attack = new Flame();
		passive = new Defensibility();
	}
	void name() {
		System.out.println("이름: 파이리, 속성: 불");
	}
}
