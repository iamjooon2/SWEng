package oop.car.v2;

public class CarGame {

	public static void main(String[] args) {
        Car c1 = CarFactory.get("빨강","현대 소나타",CarType.basic);
        Car c2 = CarFactory.get("파랑","BMW 520",CarType.sports);        
        Car c3 = CarFactory.get("화이트","F1",CarType.racing);

        c1.acc();
        c2.acc();
        c3.acc();
	}
}
