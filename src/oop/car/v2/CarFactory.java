package oop.car.v2;

public class CarFactory {
	public static Car get(String color, String model, CarType type) {
		Car car = null;
		switch(type.name()) {
		case "basic":car = new BasicCar(color,model);break;
		case "racing":car = new RacingCar(color,model);break;
		case "sports":car = new SportsCar(color,model);break;
		}
		return car;
	}
}
