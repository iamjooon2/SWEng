package pattern.pokemon;
//P315, 코드7-2
public class Purin extends Pokemon {
	public void passive() {
		System.out.println("패시브 스킬: 회피 \n"); 
		// 회피: 30% 확률로 공격 회피
	}
	public void attack() {
		System.out.println("공격 스킬: 노래하기");
		// 노래하기: 노래를 불러 상대를 잠재움
	}
	public void name() {
		System.out.println("이름: 푸린, 속성: 노멀");
	}
}
