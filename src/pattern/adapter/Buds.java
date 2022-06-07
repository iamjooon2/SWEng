package pattern.adapter;
//P345, 코드7-39
public class Buds {
	public Buds() {
		System.out.println("무선 이어폰 호환 시스템.");
	}
	public void play() { // 음악을 재생하는 표준 API
		System.out.println("삼성 Buds 음악 재생 중…");
	}
	public void stop() { // 음악을 정지하는 표준 API
		System.out.println("삼성 Buds 음악을 중지합니다!");
	}
}
