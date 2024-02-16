package ch02;

// 인터페이스 : 클래스가 구현해야만하는 메서드들을 선언하는 참조 타입 
// 인터페이스의 모든 변수는 public static final 형태가 와야함
// 인터페이스의 모든 메서드는 public abstract 형태가 와야함(default나 static 메서드가 올 수 있음)
// 인터페이스는 다중 구현이 가능

// 접근제어자 interface 인터페이스명 {...} 

// 넓이 공식
// 삼각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 삼각형 넓이
// 정사각형 넓이 구하기 - Double 변 -> Duble 정사각형 넓이
// 직사각형 넓이 구하기 - Double 밑변, Double 높이 -> Double 직사각형 넓이
// 원 넓이 구하기 - Double 반지름 -> Double 원 넓이  // 원주율은 고정되어있음

interface AreaCalculation {
		
	public static final double PI = 3.14; // PI 고정
	
	public abstract double getTriangleArea (double bottom, double height);
	public abstract double getSquareArea (double side);
	public abstract double getRectangleArea (double bottom, double height);
	public abstract double getCircleArea (double radius);
	
}

// 인터페이스는 implements 키워드를 이용해서 클래스에서 구현 해야함
class MyMath implements AreaCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		
		return bottom * height / 2; // 2 고정
	}

	@Override
	public double getSquareArea(double side) {
		
		return side * side;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		
		return radius * radius * PI; // PI를 3.14 고정
	}
	
}

// 코드에 대한 안전성 보장 원래 코드는 변함없이 ...
class MyMathV2 implements AreaCalculation {
	
	@Override
	public double getTriangleArea(double bottom, double height) {
		
		return bottom * height / 2; // 2 고정
	}

	@Override
	public double getSquareArea(double side) {
		
		return Math.pow(side, 2); // side * side
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		
		return bottom * height;
	}

	@Override
	public double getCircleArea(double radius) {
		
		return radius * radius * PI; // PI를 3.14 고정
	}
	
}



// 생성자는 반환타입을 적지않음 무조건 인스턴스로 반환

public class G_Interface {

	public static void main(String[] args) {
		
		
		AreaCalculation instance = new MyMathV2();

	}

}
