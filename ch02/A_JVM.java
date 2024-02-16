package ch02;


class ExampleClass2 {
	static int number = 3;
	double doubleNumber;
	
	Sample1 method() {
		Sample1 sample = new Sample1();
		sample.data = -456;
		return sample;
	}
	
	static void staticMethod() {
		
	}
}

class Sample1 {
	int data;
	
	Sample1 () {}
	Sample1 (Sample1 sample){
		this.data = sample.data; 
	}
}

public class A_JVM {

	public static void main(String[] args) {
		
		ExampleClass2 instance1 = new ExampleClass2();
		ExampleClass2 instance2 = new ExampleClass2();
		
		Sample1 sample = new Sample1();
		sample.data = 8;
		
		
		
		int number = 0;
		instance1.doubleNumber = 9.9;
		
		sample = instance1.method();
		
		System.out.println(sample.data);
		
		int number2 = number;
		number2++;
		System.out.println(number); // 0
		System.out.println(number2); // 1출력
		
		Sample1 sample2 = sample; // 주소가 복사됨. 인스턴스 복사X
		sample2.data++; // 주소 자체에서 +1증가 -> sample, sample2 둘다 +1 증가
		System.out.println(sample.data); // -455
		System.out.println(sample2.data); // -455
		
		
		Sample1 sample3 = new Sample1(sample); // sample 주소에 -455 저장 -> sample3도 -455로 sample3 주소에 따로 저장
		System.out.println(sample.data); // -455
		System.out.println(sample3.data); // -455
		sample3.data++; // sample3 주소에서 +1 증가
		System.out.println(sample.data); // -455 sample 주소에는 그대로 -455 저장되어있음
		System.out.println(sample3.data); // -454 sample3 주소에는 +1 증가한 상태로 있기 때문에 -454
		
		
		

	}

}
