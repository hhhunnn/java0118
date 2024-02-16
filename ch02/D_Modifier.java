package ch02;

// 기타 제어자(비접근 제어자) : 접근 제어와 무관하게 동작을 제어하는 것
// 1. final 제어자 :
// - 클래스 : final 제어자가 붙은 클래스는 확장(상속)할 수 없음
// - 메서드 : final 제어자가 붙은 메서드는 오버라이드할 수 없음
// - 변수 : final 제어자가 붙은 변수는 재할당할 수 없음
final class FinalModifier1 {
	int variable;
}
//class SubModifier1 extends FinalModifier1 {} -> final 클래스 상속 불가능


class FinalModifier2 {
	final void method () {}
}
class SubModifier2 extends FinalModifier2 {
//	void method () {} -> final 메서드 오버라이드 불가능
}


class FinalModifier3 {
	final int variable = 10;
	void method() {
//		variable = 20; -> final 변수 재할당 불가능
	}
}



// 2. static 제어자 : 
// - 메서드 : static 제어자가 붙은 메서드는 인스턴스 생성없이 클래스로 바로 호출 가능
// - 변수 : static 제어자가 붙은 변수는 인스턴스 생성없이 클래스로 바로 접근 가능
class StaticModifier {
	static int variable;
	static void method () {}
}


// 3. 제어자의 조합
class Combination {
	
	// public + static + final (주로 사용)
	public static final int NUMBER = 10;
	
	// 불가능한 조합(사용X)
	// 메서드에서 private + final
	// 메서드에서 private + abstract (서로 상충됨)
	// 클래스와 메서드에서 final + abstract (서로 상충됨)
}

// abstract 반드시 확장해서 사용, 반드시 오버라이드 해서 사용


public class D_Modifier {

	public static void main(String[] args) {
		
		// 2. static 제어자 -> 인스턴스 생성없이 바로 메서드 호출, 변수 접근 가능
		StaticModifier.variable = 0;
		StaticModifier.method();

	}

}
