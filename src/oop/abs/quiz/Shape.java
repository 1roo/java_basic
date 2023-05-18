package oop.abs.quiz;

public abstract class Shape {

	/*
    1. 도형의 이름을 저장할 수 있는 변수(name)을 private으로 선언.

    2. 생성자를 선언 -> 매개값으로 도형의 이름을 받아서 저장할 수 있도록.

    3. 자식 클래스에게 오버라이딩을 강제할 수 있는 메서드 
        getArea() 를 선언 (return type -> double)

    4. 도형 이름을 출력할 수 있는 메서드 getName()을 선언. (강제 x)
	 */


	private String name; //private를 쓰면 바로 getter setter 만드는게 좋음.
	double r;

	public Shape(String name, double r) {
		this.name = name;
		this.r = r;
	}

	
	public abstract void getArea();
	
	public void getName() {
		System.out.println("도형이름: " + name);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}




}
