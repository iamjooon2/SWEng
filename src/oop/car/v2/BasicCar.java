package oop.car.v2;

public class BasicCar extends Car {

	public BasicCar(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void go() {
		curSpeed = curSpeed + 20;
	}

}
