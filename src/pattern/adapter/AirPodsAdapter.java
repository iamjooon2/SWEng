package pattern.adapter;
//P3456, 코드7-40
class AirPodsAdapter extends AirPods implements AirPodsInterface {
	public AirPodsAdapter() {
		System.out.println("AirPods이 SamsungPhone과 호환됩니다.");
	}
	public void play() {
		super.playing();
	}
	public void stop() {
		super.stopping();
	}
}
