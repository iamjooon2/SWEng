package oop.car;

public class RacingCar extends Car {

	public RacingCar(String color , String model) {
		super(color, model);
	}
	
	@Override
	public void go() {
		curSpeed = curSpeed + 40;
        prtInfo();
	}
	
}