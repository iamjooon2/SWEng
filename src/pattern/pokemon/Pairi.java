package pattern.pokemon;
//P315, 코드7-3
public class Pairi extends Pokemon {
	public void passive() {
		System.out.println("패시브 스킬: 방어\n");
		// 방어: 받는 피해를 40% 감소시킴
	}
	public void attack() {
		System.out.println("공격 스킬: 불꽃");
		// 불꽃: 뜨거운 불꽃을 상대한테 쏨
	}
	void name() {
		System.out.println("이름: 파이리, 속성: 불");
	}
}
