package ch02;

// 접근 제어자 : 클래스, 필드, 메서드에 대해서 외부 접근에 대한 제어를 하는 것
// private : 같은 클래스 내부에서만 접근 가능
// default(작성X) : 같은 패키지 내부에서만 접근 가능
// protected : 같은 패키지 내부 혹은 외부 패키지의 자손 클래스에서만 접근 가능
// public : 모든 패키지에서 접근 가능 - 하나의 클래스에 두개 사용 불가


class AccessModifier {
	
	void method () {
		
		// public 이기 때문에 외부 클래스에서도 접근이 가능
		C_AccessModifier instance = new C_AccessModifier();
		
		// C_AccessModifier 클래스의 privateVariable 필드는 
		// 제어자가 private 이기 때문에 외부 클래스에서는 접근이 불가능
//		instance.privateVariable = 0;
	}
}


// ch02_sub 패키지의 C_AccessModifierSub 클래스와 함께 참조
public class C_AccessModifier {

	private int privateVariable;
	int defaultVariable; 
	protected int protectedVariable;
	public int publicVariable;
	
	// C_AccessModifier 클래스의 privateVariable 필드는 
	// 제어자가 private 이기 때문에 같은 내부 클래스에서만 접근이 가능
	void method () {
		privateVariable = 0;
	}
}
