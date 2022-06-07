package pattern.pokemon.strategy;
//P321, 코드7-9
public class Pikachu extends Pokemon {
	public Pikachu() {
		attack = new millionVolt();
		passive = new Speedability();
	}
	void name() {
		System.out.println("이름: 피카츄, 속성: 번개");
	}
}