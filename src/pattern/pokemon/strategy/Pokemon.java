package pattern.pokemon.strategy;
//P320, ÄÚµå7-6
public abstract class Pokemon {
	public Attack attack;
	public Passive passive;
	public Pokemon() {
	}
	public void introduce() {
		name();
		attack.motion();
		passive.detail();
	}
	abstract void name();
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	public void setPassive(Passive passive) {
		this.passive = passive;
	}
}
