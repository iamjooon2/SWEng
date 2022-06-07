package pattern.pokemon;
//P314, ÄÚµå7-1
public abstract class Pokemon {
	public void introduce() {
		name();
		attack();
		passive();
	}
 abstract void name();
 abstract void attack();
 abstract void passive();
}
