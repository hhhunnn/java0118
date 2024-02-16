package ch01;

import java.util.Scanner;

public class D_Control {

	public static void main(String[] args) {
		
//		제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		Scanner scanner = new Scanner(System.in);
		
//		조건문 : 특정 조건이 만족하면 코드를 실행하는 것, 만족하지 않으면 실행하지 않음
		
//		if : 주어진 조건이 true이면 코드를 실행하도록 하는 것
//		if (조건-논리표현식) { 실행할 코드 }
		int age = 18;
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		System.out.println("프로그램 종료");
		
		
//		age2는 17보다 크거나 같으면서 19보다 작거나 같아야한다. - and
//		age >= 17 && age <= 19
		
//		age2는 17보다 크거나 같거나 19보다 작거나 같아야한다. - or
//		age >= 17 || age <= 19
		
		if(age >= 17 && age <= 19) {
			System.out.println("고등학생입니다.");
		}
		System.out.println("프로그램 종료1");
		
//		변수를 이용해서 수식 정리(가독성을 위해)
		boolean isHighSchool = age >= 17 && age <= 19;
		if(isHighSchool) {
			System.out.println("고등학생입니다.");
		}
		System.out.println("프로그램 종료2");
		
		// 고등학생이 아닌 경우
		if(age < 17 || age > 19) {
			System.out.println("고등학생이 아닙니다.");
		}
		System.out.println("프로그램 종료3");
//		부정연산자 : 논리 표현식을 부정하는 연산
//		!논리 : true면 false, false면 true
		if(!isHighSchool) {
			System.out.println("고등학생입니다.");
		}
		System.out.println("프로그램 종료4");
		
		
		System.out.println("========else========");
		
//		else : if 문의 조건 - 논리표현식이 false면 코드를 실행하도록 하는 것
//		if (조건-논리표현식) { true이면 실행할 코드 }
//		else { false이면 실행할 코드 }
		
//		1. else문은 반드시 if문 이후에 와야함 (else 단독으로 사용이 불가능)
//		2. else문에는 조건을 작성하지 않음
		age = 10;
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		System.out.println("프로그램 종료");
		
//		- 코드가 한 줄일 경우 : 대괄호 '{}' 생략 가능
//		if (age > 19) System.out.println("성인입니다.");
//		else System.out.println("미성년자입니다.");
//		System.out.println("프로그램 종료");
		
//		- 다른 지역일 경우 변수 중복 가능
		// String result = "프로그램 시작"; - Error(프로그램이 위에서부터 아래로 내려오기 때문에 중복O)
		if (age > 19) {
			String result = "성인입니다.";
		} else {
			String result = "미성년자 입니다.";
		}
		String result = "프로그램 종료";
		
		
		String fruit = "수박";
		if (fruit.equals("사과")) {
			System.out.println();
		} else {
			if(fruit.equals("바나나")) {
				
			} else {
				if(fruit.equals("귤")) {
					
				}else {
					
				}
			}
		}
		
		
		System.out.println("===========switch===========");
		
//		switch : 특정 변수 또는 값에 따라 실행할 코드 블록의 범위를 결정하는 것
//		switch (변수-일반표현식) {
//			case 값1: 
//				변수-일반표현식이 값1과 같을때 시작할 코드 위치
//			case 값2:
//				변수-일반표현식이 값2과 같을때 시작할 코드 위치
//				break;
//				switch 내부에서 break문을 만나면 switch문을 종료
//			case 값2:
//				변수-일반표현식이 값2과 같을때 시작할 코드 위치
//			default:
//				변수-일반표현식이 case의 값과 일치하는 것이 없거나
//					바로 위에서 break문을 만나지 않으면 실행되는 코드
//		}
		int input = scanner.nextInt();
		// input 이 0이면 ABC를 출력
		// input 이 1이면 BC를 출력
		// input 이 2이면 C를 출력
		// input 이 3이면 DEF를 출력
		// input 이 4이면 EF를 출력
		// input 이 0-4가 아니면 F를 출력
		
		switch (input) {
		
		case 0:
			System.out.print("A");
		case 1:
			System.out.print("B");
		case 2:
			System.out.print("C");
			break;
		case 3:
			System.out.print("D");
		case 4:
			System.out.print("E");
		default:
			System.out.print("F");
		
		}
		
		// input 이 0이면 A를 출력
		// input 이 1이면 B를 출력
		// input 이 2이면 C를 출력
		// input 이 3이면 D를 출력
		// input 이 4이면 E를 출력
		// input 이 0-4가 아니면 F를 출력
				
		System.out.println();
		
		switch (input) {
				
			case 0:
				System.out.println("A");
				break;
			case 1:
				System.out.println("B");
				break;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
				break;
			default:
				System.out.println("F");
		}
		
		
		
	
		System.out.println("===========for==========");
		
//		반복문 : 특정 조건에 부합하면 지정한 코드를 여러 번 실행하도록 하는 것
		
//		for : 일반적 반복 횟수가 정해져 있을 때 사용하는 반복문
//		for (조건에 사용할 변수 초기화; 조건; 조건에 사용할 변수증감) { 반복할 코드 }
		
		for (int count = 1; count <= 3; count++) {
			System.out.println(count);
			System.out.println("안녕하세요");
		}
		
//		System.out.println("1번 안녕하세요.");
//		System.out.println("2번 안녕하세요.");
//		System.out.println("3번 안녕하세요.");
//		System.out.println("4번 안녕하세요.");
//		System.out.println("5번 안녕하세요.");
		for(int count = 1; count <= 5; count++) {
			System.out.println(count + "번 안녕하세요.");
		}
		
		
//		System.out.println("-1번 안녕하세요.");
//		System.out.println("2번 안녕하세요.");
//		System.out.println("5번 안녕하세요.");
//		System.out.println("8번 안녕하세요.");
//		System.out.println("11번 안녕하세요.");
		for (int count = 1; count <= 5; count++) {
			System.out.println((3*count-4) + "번 안녕하세요.");
		}
		
		System.out.println("==========");
		
//		System.out.println("구구단 2단");
//		
//		for (int n = 1; n < 10; n++) {
//			System.out.println("2 * " + n + " = " + (2 * n));
//		}
		
//		System.out.println("구구단 2~9단");
		
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + " x " + j + " = " + (i * j));
//				System.out.print("   ");
//			}
//			System.out.println();
//		}
		
		
		int[] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		System.out.println("=========foreach========");
		
//		foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 '복사'하여 사용하는 반복문
//		numbers : {1, 2, 3, 4, 5}
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("==========");
				
		for (int number : numbers) {
			number = 0;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		
		
		System.out.println("==========while문===========");
		
//		while : 반복할 횟수가 정해져있지 않을 때 사용하는 반복문
//		조건이 true인 동안 반복, 조건이 false가 되면 반복 종료
		
		int input2 = scanner.nextInt();
		input2 = 1;
		
		while(input2 != 0) {
			input2 = scanner.nextInt();
			// input 2로 나눴을때 나머지가 0이 아닌 경우(홀수) 
			if (input2 % 2 != 0) {
				// continue : 반복문에서 continue문을 만나면 조건 검사로 넘어감
				continue;
			}
			if (input2 == 0) {
				// break : 반복문에서 break문을 만나면 반복문을 종료
				break;
			}
			System.out.println("입력값 : " + input2);
			System.out.println("while 반복문 실행중....");
		}
		System.out.println("while 반복문 종료");
		
		// i가 8되기 전까지 3의 배수를 제외하고 출력
		for (int i = 0; i < 10; i++) {
			// 3의 배수인 경우 continue
			if(i % 3 == 0) continue;
			if (i == 8) break;
			System.out.println(i);
		} // 1, 2, 4, 5, 7 출력
		
	}

}
