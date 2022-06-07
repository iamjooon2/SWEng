package oop.car;

public class Car {
    private String color;
    private String model;
    int curSpeed;

    public Car() {
        curSpeed = 0;
    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void go() {
        curSpeed += 10;
        prtInfo();
    }
    
    public void prtInfo() {
        System.out.printf("%s: 가속, 현재속도: %d\n", model, curSpeed);	
    }

    public void stop() {
        curSpeed = 0;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCurSpeed() {
		return curSpeed;
	}

	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}
}
