package oop.car;

public class CarGame {

	public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("빨강");
        c1.setModel("현대 소나타");

        Car c2 = new Car("파랑","BMW 520");        
        Car c3 = new RacingCar("화이트","F1");
        c1.go();
        c2.go();
        c3.go();
	}
}
