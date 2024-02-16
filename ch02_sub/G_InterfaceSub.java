package ch02_sub;

// G_Method 사용X G_Message 기능 사용O
class InterfaceSub implements G_Message {
	
	int method3 (int number) {
		
		System.out.println(GREETING_MESSAGE);
		System.out.println(GOODBYE_MESSAGE);
		return 3 + number;
	}
}




public class G_InterfaceSub implements G_Message, G_Method {
	
	// 좁은 범위의 접근제어자? 사용X public 필요함
	public void method1 () {
		System.out.println(GREETING_MESSAGE);
		
		System.out.println(GOODBYE_MESSAGE);
	}
	
	public void method2 () {
		System.out.println(G_Message.GREETING_MESSAGE);
	
		System.out.println(G_Message.GOODBYE_MESSAGE);
	}

}
