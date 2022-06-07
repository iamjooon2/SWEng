package pattern.pokemon;
//P316, 코드7-4
public class Pikachu extends Pokemon {
	public void passive() {
		System.out.println("패시브 스킬: 스피드 \n");
		// 스피드: 한 번에 두 번 공격함
	}
	public void attack() {
		System.out.println("공격 스킬: 백만 볼트");
		// 백만 볼트: 백만 볼트의 강력한 전압으로 공격함
	}
	void name() {
		System.out.println("이름: 피카츄, 속성: 번개");
	}
}
