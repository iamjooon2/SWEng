package pattern.pokemon.strategy;
//P323, ÄÚµå7-18
public class Main {
	public static void main(String args[]) {
		Pokemon pikachu = new Pikachu();
		pikachu.introduce();
		Pokemon pairi = new Pairi();
		pairi.introduce();
		Pokemon purin = new Purin();
		purin.introduce();
		purin.setAttack(new millionVolt());
		purin.setPassive(new Defensibility());
		purin.introduce();
	}
}
