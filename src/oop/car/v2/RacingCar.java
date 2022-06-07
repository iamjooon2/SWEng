package oop.car.v2;

public class RacingCar extends Car {

	public RacingCar(String color , String model) {
		super(color, model);
	}
	
	@Override
	public void go() {
		curSpeed = curSpeed + 40;
	}
	
}