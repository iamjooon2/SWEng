package oop.car.v2;

public class SportsCar extends Car {

	public SportsCar(String color , String model) {
		super(color, model);
	}
	
	@Override
	public void go() {
		curSpeed = curSpeed + 30;
	}
	
}