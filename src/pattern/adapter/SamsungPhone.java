package pattern.adapter;
//P346, 코드7-42
public class SamsungPhone {
	Buds buds = new Buds();
	AirPodsAdapter airpodsadapter;
	public SamsungPhone() {
		installAirPods();
		System.out.println();
		testBuds();
		System.out.println();
		testAirPods();
	}
	public void installAirPods() {
		airpodsadapter = new AirPodsAdapter();
		System.out.println("Buds와 새로 구입한 AirPods을 연결합니다.");
	}
	public void testBuds() {
		buds.play();
		buds.stop();
	}
	public void testAirPods() {
		airpodsadapter.play();
		airpodsadapter.stop();
	}
}