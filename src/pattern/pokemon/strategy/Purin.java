package pattern.pokemon.strategy;
//P320, 코드7-8
public class Purin extends Pokemon {
	public Purin() {
		attack = new Sing();
		passive = new Avoidability();
	}
	void name() {
		System.out.println("이름: 푸린, 속성: 노멀");
	}
}
